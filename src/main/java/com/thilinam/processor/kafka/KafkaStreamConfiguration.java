package com.thilinam.processor.kafka;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsConfig;

import java.util.Properties;

import static com.thilinam.processor.configuration.AppConfig.APPLICATION_CLIENT_ID;
import static com.thilinam.processor.configuration.AppConfig.BOOTSTRAP_SERVER;

/**
 * <p>
 *     This class contains the configurations which are related to kafka
 * </p>
 */
public class KafkaStreamConfiguration {

    public Properties getKafkaStreamConfigurationProperties(){
        Properties properties = new Properties();
        properties.setProperty(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG,BOOTSTRAP_SERVER);
        properties.setProperty(StreamsConfig.APPLICATION_ID_CONFIG,APPLICATION_CLIENT_ID);
        properties.setProperty(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
        properties.setProperty(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG,Serdes.String().getClass().getName());
        return properties;
    }

}