package com.agustin.munoz.kafka.service;

import java.io.IOException;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class Consumer {

    //private final Logger logger = LoggerFactory.getLogger(Producer.class);

    @KafkaListener(topics = "users2", groupId = "test-consumer-group")
    public void consume(String message) throws IOException {
        log.info(String.format("#### -> Consumed message -> %s", message));
    }
}