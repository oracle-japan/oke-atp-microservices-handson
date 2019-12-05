# OCI Service

variable "autonomous_database_admin_password" {
  default = "WorkshopPassword123456"
}

variable "autonomous_database_cpu_core_count" {
  default = "1"
}

variable "autonomous_database_data_storage_size_in_tbs" {
  default = "1"
}

variable "autonomous_database_db_name" {
  default = "tfOKEATPDB"
}

variable "autonomous_database_display_name" {
  default = "TF_OK_EATP_DB"
}

variable "autonomous_database_license_model" {
  default = "LICENSE_INCLUDED"
}

variable "autonomous_database_wallet_password" {
  default = "WorkshopAutonomousDatabasePassword123"
}
