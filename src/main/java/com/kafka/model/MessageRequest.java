package com.kafka.model;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MessageRequest {
    private String topic;
    private String message;
}
