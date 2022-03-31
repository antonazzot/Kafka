package KafkaProject.Kafka.kafkalistener;

import org.springframework.stereotype.Component;

@Component
public class KafkaStringListener {
    @org.springframework.kafka.annotation.KafkaListener(topics = "secondtopic",
    groupId = "mygroup")
    public void listener (String data) {

        System.out.println(  data + " !!!!");
    }

}
