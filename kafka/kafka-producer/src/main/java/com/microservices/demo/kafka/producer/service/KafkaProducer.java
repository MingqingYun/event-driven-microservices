package com.microservices.demo.kafka.producer.service;

import com.microservices.demo.kafka.avro.model.TwitterAvroModel;
import org.apache.avro.specific.SpecificRecordBase;

import java.io.Serializable;

public interface KafkaProducer <K extends Serializable, V extends SpecificRecordBase> {
    void send(String topicName, Long key, TwitterAvroModel message);
}
