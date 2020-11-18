package com.example.kafka.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "kafkacontroller")
@Slf4j
public class KafkaController {

    @Autowired
    private KafkaTemplate<Object,Object> template;

    @KafkaListener(id = "webGroup", topics = "topic_input")
    public void listen(String input) {
        log.info("input value: {}" , input);
    }
}
