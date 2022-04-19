package com.thilinam.processor;

import com.thilinam.processor.kafka.KafkaStreamTopology;

public class KafkaStreamExecutor {
    public static void main(String[] args) {
        KafkaStreamTopology process = new KafkaStreamTopology();
        process.initiateKafkaStreams();
    }
}