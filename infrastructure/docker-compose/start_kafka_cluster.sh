#!/bin/bash

# Переход в директорию

# Запуск Zookeeper
gnome-terminal -- bash -c "docker-compose -f common.yml -f zookeeper.yml up; exec bash"

# Пауза для старта Zookeeper
sleep 10

# Проверка Zookeeper
echo ruok | nc localhost 2181

# Запуск Kafka кластера
gnome-terminal -- bash -c "docker-compose -f common.yml -f kafka_cluster.yml up; exec bash"

# Пауза для старта Kafka
sleep 10

# Инициализация Kafka
gnome-terminal -- bash -c "docker-compose -f common.yml -f init_kafka.yml up; exec bash"
