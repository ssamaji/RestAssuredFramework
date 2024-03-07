FROM amazoncorretto:11

# Set environment variables
ENV GRADLE_VERSION=6.0 \
    TESTNG_VERSION=7.9.0

# Set the working directory
WORKDIR /RestAssuredFramework

# Install required tools
RUN yum install -y wget unzip curl bash

# Install Gradle
RUN wget https://services.gradle.org/distributions/gradle-6.0-bin.zip -P /opt && \
    unzip -d /opt /opt/gradle-6.0-bin.zip && \
    ln -s /opt/gradle-6.0/bin/gradle /usr/local/bin/gradle && \
    rm /opt/gradle-6.0-bin.zip

# Install Allure
RUN curl -o allure.tgz -Ls https://github.com/allure-framework/allure2/releases/download/2.16.0/allure-2.16.0.tgz && \
    tar -zxvf allure.tgz && \
    rm allure.tgz && \
    ln -s /RestAssuredFramework/allure-2.16.0/bin/allure /usr/local/bin/allure

# Expose the port that Allure will run on
EXPOSE 5050

# Copy the local Gradle project to the container
COPY build/libs/RestAssuredFramework-1.0-SNAPSHOT.jar /RestAssuredFramework

# CMD ["./gradlew", "test"]
CMD ["java", "-jar", "/RestAssuredFramework/RestAssuredFramework-1.0-SNAPSHOT.jar"]
