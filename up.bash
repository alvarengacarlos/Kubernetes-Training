#!/bin/bash

MK_DOCS_IMG_TAG="doc:v1.0.0"
JOB_IMG_TAG="job:v1.0.0"

create_img_fn() {
    docker image build --no-cache -f $1 --tag $2 ./$3
}

eval $(minikube docker-env)

create_img_fn "doc-service/Dockerfile" $MK_DOCS_IMG_TAG "doc-service"
create_img_fn "job-service/Dockerfile" $JOB_IMG_TAG "job-service"

echo "Ready"
