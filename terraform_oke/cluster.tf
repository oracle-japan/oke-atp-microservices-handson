// Copyright (c) 2017, 2019, Oracle and/or its affiliates. All rights reserved.

resource "oci_containerengine_cluster" "workshop_cluster" {
  #Required
  compartment_id     = "${var.compartment_ocid}"
  kubernetes_version = "${data.oci_containerengine_cluster_option.workshop_cluster_option.kubernetes_versions.1}"
  name               = "${var.cluster_name}"
  vcn_id             = "${oci_core_vcn.workshop_vcn.id}"

  #Optional
  options {
#    service_lb_subnet_ids = ["${oci_core_subnet.clusterSubnet_1.id}", "${oci_core_subnet.clusterSubnet_2.id}"]
    service_lb_subnet_ids = ["${oci_core_subnet.clusterSubnet_1.id}"]

    #Optional
    add_ons {
      #Optional
      is_kubernetes_dashboard_enabled = "${var.cluster_options_add_ons_is_kubernetes_dashboard_enabled}"
      is_tiller_enabled               = "${var.cluster_options_add_ons_is_tiller_enabled}"
    }

    kubernetes_network_config {
      #Optional
      pods_cidr     = "${var.cluster_options_kubernetes_network_config_pods_cidr}"
      services_cidr = "${var.cluster_options_kubernetes_network_config_services_cidr}"
    }
  }
}

resource "oci_containerengine_node_pool" "workshop_node_pool" {
  #Required
  cluster_id         = "${oci_containerengine_cluster.workshop_cluster.id}"
  compartment_id     = "${var.compartment_ocid}"
  kubernetes_version = "${data.oci_containerengine_node_pool_option.workshop_node_pool_option.kubernetes_versions.1}"
  name               = "${var.node_pool_name}"
  node_image_name    = "${var.node_pool_node_image_name}"
  node_shape         = "${var.node_pool_node_shape}"

  #Optional
  initial_node_labels {
    #Optional
    key   = "${var.node_pool_initial_node_labels_key}"
    value = "${var.node_pool_initial_node_labels_value}"
  }

  ssh_public_key = "${var.node_pool_ssh_public_key}"

  node_config_details {
    placement_configs {
      availability_domain = "${data.oci_identity_availability_domain.ad1.name}"
      subnet_id           = "${oci_core_subnet.node_pool_regional_subnet_1.id}"
    }

#    placement_configs {
#      availability_domain = "${data.oci_identity_availability_domain.ad1.name}"
#      subnet_id           = "${oci_core_subnet.node_pool_regional_subnet_2.id}"
#    }

    size = 1
  }
}

output "cluster" {
  value = {
    id                 = "${oci_containerengine_cluster.workshop_cluster.id}"
    kubernetes_version = "${oci_containerengine_cluster.workshop_cluster.kubernetes_version}"
    name               = "${oci_containerengine_cluster.workshop_cluster.name}"
  }
}

output "node_pool" {
  value = {
    id                 = "${oci_containerengine_node_pool.workshop_node_pool.id}"
    kubernetes_version = "${oci_containerengine_node_pool.workshop_node_pool.kubernetes_version}"
    name               = "${oci_containerengine_node_pool.workshop_node_pool.name}"
  }
}
