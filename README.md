# Kafka Quickstart Guide

This guide provides the essential steps to set up and use Kafka on your local Windows machine.

## Prerequisites

Ensure you have Kafka downloaded and extracted to the directory `C:\Users\zeesh\Downloads\kafka`.

## Step-by-Step Instructions

### 1. Start Zookeeper

Navigate to your Kafka installation directory and start Zookeeper:

cd C:\Users\zeesh\Downloads\kafka
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

### 2. Start Kafka Server

In a new terminal, navigate to your Kafka installation directory and start the Kafka server:

.\bin\windows\kafka-server-start.bat .\config\server.properties

### 3. Create a Topic

In a new terminal, navigate to your Kafka installation directory and create a new topic named "my-topic":

.\bin\windows\kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic my-topic

### 4. Start Producer

In a new terminal, navigate to your Kafka installation directory and start a Kafka producer:

.\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic my-topic

### 5. Start Consumer

In a new terminal, navigate to your Kafka installation directory and start a Kafka consumer:

.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic my-topic --from-beginning

### 6. List Topics

In a new terminal, navigate to your Kafka installation directory and see a list of all topics:

.\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092

### 7. Delete Topic

.\bin\windows\kafka-topics.bat --delete --bootstrap-server localhost:9092 --topic my-topic

**Note:** Ensure to take appropriate backups and precautions before deleting any topic, as it will permanently remove
all the associated data.

---

Enjoy working with Kafka!



