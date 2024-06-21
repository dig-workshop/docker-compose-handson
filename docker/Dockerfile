FROM gradle:8 AS base

CMD ["bash"]


FROM base AS server_build

WORKDIR /api
COPY ../api .
RUN ./gradlew build --no-daemon -x test


FROM openjdk:21 AS development
COPY --from=server_build /api/build/libs/api-0.0.1-SNAPSHOT.jar ./app.jar
EXPOSE 8081
CMD [ "java", "-jar", "app.jar" ]