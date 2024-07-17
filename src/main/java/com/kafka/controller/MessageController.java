package com.kafka.controller;

import com.kafka.model.MessageRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/message/")
public class MessageController {
    private final KafkaTemplate<String, String> kafkaTemplate;
    @Value("${kafka.topic}")
    private String topic;

    @PostMapping("/publish")
    public void published(@RequestBody MessageRequest request) {
        kafkaTemplate.send(topic, request.getMessage());
    }
}
