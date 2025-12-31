package com.lokesh.portfolio.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.kafka.core.KafkaTemplate;

@Service
public class kafkaProducer {

    private static final Logger LOGGER = LoggerFactory.getLogger(kafkaProducer.class);

    private KafkaTemplate<String, String> kafkaTemplate;

    public kafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendmsg(String msg){
        LOGGER.info(String.format("msg sent %s", msg));
        kafkaTemplate.send("MovieRegistered", msg);
    }
}
