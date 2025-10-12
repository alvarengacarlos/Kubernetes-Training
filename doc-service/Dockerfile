FROM python:slim AS build

WORKDIR /build

RUN pip install mkdocs

COPY mkdocs.yml .
COPY docs docs/

RUN mkdocs build


FROM httpd:latest

WORKDIR /usr/local/apache2/htdocs/

RUN apt update
RUN apt upgrade -y

COPY --from=build /build/site .

EXPOSE 80/tcp
