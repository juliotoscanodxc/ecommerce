package com.luxoft.ecommerce.producer;

import com.luxoft.ecommerce.dto.PurchaseOrder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.Random;

@Configuration
@Slf4j
public class PurchaseProducer {

    @Value(value = "${spring.kafka.producer.purchase.topic}")
    private String topic;

    @Autowired
    private KafkaTemplate<Integer, PurchaseOrder> kafkaTemplate;

    public void send(PurchaseOrder purchaseOrder) {
        Integer key = new Random().nextInt(1000000);

        // ListenableFuture<SendResult<Integer, PurchaseOrder>> future = kafkaTemplate.send(topic, key, purchaseOrder);

        // ListenableFuture<SendResult<Integer, PurchaseOrder>> future = kafkaTemplate.send(topic, key, purchaseOrder);
    }
}
