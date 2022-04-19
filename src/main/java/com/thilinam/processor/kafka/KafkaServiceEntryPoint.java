package com.thilinam.processor.kafka;

import com.thilinam.kafka.KafkaProducerDetail;

public class KafkaServiceEntryPoint {
    /**
     * <p>
     *     This method write the given messages to a specific kafka topic
     * </p>
     * @param topic
     * @param payload
     */
    public void pushMessageToKafka(String topic,String payload){
        KafkaProducerDetail instance = KafkaProducerDetail.getProducerInstance();
        instance.produceRecord(topic,payload);

    }
}
