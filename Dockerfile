FROM adoptopenjdk:11-jdk-hotspot-bionic

# Set environment variables
ENV GRADLE_VERSION=6.0 \
    TESTNG_VERSION=7.9.0

# Set the working directory
WORKDIR /RestAssuredFramework

# Install required tools
RUN apt-get update && \
    apt-get install -y wget unzip && \
    rm -rf /var/lib/apt/lists/*

# Install Gradle
RUN wget https://services.gradle.org/distributions/gradle-6.0-bin.zip -P /opt && \
    unzip -d /opt /opt/gradle-6.0-bin.zip && \
    ln -s /opt/gradle-6.0/bin/gradle /usr/local/bin/gradle && \
    rm /opt/gradle-6.0-bin.zip

# Copy the local Gradle project to the container
COPY . .

# Build the project
RUN ./gradlew build

CMD ["./gradlew", "test"]
