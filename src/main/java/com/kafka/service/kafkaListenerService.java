package com.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class kafkaListenerService {


    @KafkaListener(topics = "husanboy", groupId ="groupId")
    void listener(String data) {
        System.out.println("data received => " + data);
    }
}
