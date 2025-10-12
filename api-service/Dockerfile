FROM amazoncorretto:25 AS build

WORKDIR /api

COPY api .

WORKDIR /api/app/src/main/resources

RUN sed -i 's|^mongoDb\.connection\.url=.*|mongoDb.connection.url=mongodb://localhost:27017|' application.properties

WORKDIR /api

RUN ./gradlew bootJar


FROM amazoncorretto:25

WORKDIR /app

COPY --from=build /api/app/build/libs/app-*.jar app.jar

EXPOSE 8080/tcp

CMD ["java", "-jar", "app.jar"]
