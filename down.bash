#!/bin/bash

MK_DOCS_IMG_TAG="doc:v1.0.0"
MONGO_DB_IMG_TAG="mongodb:v1.0.0"
SPRING_BOOT_IMG_TAG="api:v1.0.0"
JOB_IMG_TAG="job:v1.0.0"

destroy_img_fn() {
    docker image rm $1
}

eval $(minikube docker-env)

destroy_img_fn $MK_DOCS_IMG_TAG
destroy_img_fn $MONGO_DB_IMG_TAG
destroy_img_fn $SPRING_BOOT_IMG_TAG
destroy_img_fn $JOB_IMG_TAG
