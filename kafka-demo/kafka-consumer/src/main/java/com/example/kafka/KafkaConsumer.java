package com.example.kafka;

import static org.springframework.kafka.support.KafkaHeaders.TOPIC;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaConsumer {
    private static final String TOPIC = "topics";

    // 가장 기본적인 Consumer
//    @KafkaListener(topics = "topic")
//    public void listenMessage(String message) {
//        log.info("Consuming: {}", message);
//    }pr
    // partition 나눠듣기
//    @KafkaListener(
//            topicPartitions = @TopicPartition(
//                    topic = TOPIC, partitions = "0")
//    )
//    public void listenMessage0(String message) {
//        log.info("Consuming 0: {}", message);
//    }
//
//    @KafkaListener(
//            topicPartitions = @TopicPartition(
//                    topic = TOPIC, partitions = "1"))
//    public void listenMessage1(String message) {
//        log.info("Consuming 1: {}", message);
//    }
//
//    @KafkaListener(
//            topicPartitions = @TopicPartition(
//                    topic = TOPIC, partitions = "2"))
//    public void listenMessage2(String message) {
//        log.info("Consuming 2: {}", message);
//    }

    @KafkaListener(topics = TOPIC)
    public void listenMesage(PayloadDto dto) {
        log.info("Consuming 2: {}", dto.getMessage());
    }
}
