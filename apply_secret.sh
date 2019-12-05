#!/bin/bash

mkdir ./terraform_atp/Wallet_tfOKEATPDB
unzip ./terraform_atp/Wallet_tfOKEATPDB.zip -d ./terraform_atp/Wallet_tfOKEATPDB

cat <<EOF | ./kubectl apply -f -
apiVersion: v1
kind: Secret
metadata:
  name: atp-secret
  namespace: default
type: Opaque
data:
  ojdbc.properties: `cat terraform_atp/Wallet_tfOKEATPDB/ojdbc.properties | base64 -w0`
  tnsnames.ora: `cat terraform_atp/Wallet_tfOKEATPDB/tnsnames.ora | base64 -w0`
  sqlnet.ora: `cat terraform_atp/Wallet_tfOKEATPDB/sqlnet.ora | base64 -w0`
  cwallet.sso: `cat terraform_atp/Wallet_tfOKEATPDB/cwallet.sso | base64 -w0`
  ewallet.p12: `cat terraform_atp/Wallet_tfOKEATPDB/ewallet.p12 | base64 -w0`
  keystore.jks: `cat terraform_atp/Wallet_tfOKEATPDB/keystore.jks | base64 -w0`
  truststore.jks: `cat terraform_atp/Wallet_tfOKEATPDB/truststore.jks | base64 -w0`
EOF
