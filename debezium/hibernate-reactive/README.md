# Hibernate Reactive Example

This module is a simple reactive application using Quarkus and Hibernate Reactive.

## Dev

You can run this application in dev mode using:

```shell
> mvn quarkus:dev
```

The application is exposed on `http://localhost:8080/customer`.

## Build

Build it the application package using:

```shell
> mvn clean package
```

The output is located in `target/quarkus-app`

## Run

Once packaged, you can run the application with:

```shell
> java -jar target/quarkus-app/quarkus-run.jar
```

In production mode, you need to start a PostgreSQL instance in Docker.
You can create one using:

```shell
docker run --ulimit memlock=-1:-1 -it --rm=true --memory-swappiness=0 --name quarkus_test -e POSTGRES_USER=quarkus_test -e POSTGRES_PASSWORD=quarkus_test -e POSTGRES_DB=quarkus_test -p 5432:5432 postgres:13.2
```
