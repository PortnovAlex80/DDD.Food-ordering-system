#!/bin/bash

# Переход в директорию

# Запуск Zookeeper
docker-compose -f common.yml -f zookeeper.yml up

# Пауза для старта Zookeeper
sleep 10

# Проверка Zookeeper
echo ruok | nc localhost 2181

# Запуск Kafka кластера
docker-compose -f common.yml -f kafka_cluster.yml up

# Пауза для старта Kafka
sleep 10

# Инициализация Kafka
docker-compose -f common.yml -f init_kafka.yml up
