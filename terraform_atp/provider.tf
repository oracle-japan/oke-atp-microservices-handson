// Copyright (c) 2017, 2019, Oracle and/or its affiliates. All rights reserved.

/*
 * This example file shows how to configure the oci provider to target a single region.
 */

// These variables would commonly be defined as environment variables or sourced in a .env file
variable "tenancy_ocid" {}

variable "user_ocid" {}
variable "fingerprint" {}
variable "private_key_path" {}
variable "compartment_ocid" {}

variable "region" {
  default = "ap-tokyo-1"
}

variable "disable_auto_retries" {
  default = true
}

provider "oci" {
  region           = "${var.region}"
  tenancy_ocid     = "${var.tenancy_ocid}"
  user_ocid        = "${var.user_ocid}"
  fingerprint      = "${var.fingerprint}"
  private_key_path = "${var.private_key_path}"
  disable_auto_retries = "${var.disable_auto_retries}"
}

# Get a list of Availability Domains
data "oci_identity_availability_domains" "ads" {
  compartment_id = "${var.tenancy_ocid}"
}

# Output the result
output "show-ads" {
  value = "${data.oci_identity_availability_domains.ads.availability_domains}"
}

data "oci_database_autonomous_database_wallet" "autonomous_database_wallet" {
  autonomous_database_id = "${oci_database_autonomous_database.workshop_autonomous_database.id}"
  password               = "${var.autonomous_database_wallet_password}"
  base64_encode_content  = "true"
}

resource "local_file" "autonomous_database_wallet_file" {
  content_base64 = "${data.oci_database_autonomous_database_wallet.autonomous_database_wallet.content}"
  filename       = "./Wallet_tfOKEATPDB.zip"
}
