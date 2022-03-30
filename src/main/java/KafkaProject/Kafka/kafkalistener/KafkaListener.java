package KafkaProject.Kafka.kafkalistener;

import org.springframework.stereotype.Component;

@Component
public class KafkaListener {
    @org.springframework.kafka.annotation.KafkaListener(topics = "secondtopic",
    groupId = "mygroup")
    public void listener (String data) {
        System.out.println("What you will cooking for dinner, Kit  ? " + data + " !!!!");
    }

}
