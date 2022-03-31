package KafkaProject.Kafka.kafkalistener;

import KafkaProject.Kafka.model.Message;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.stereotype.Component;

@Component
public class KafkaObjectListener {
    @org.springframework.kafka.annotation.KafkaListener(topics = "messagetopic",
    groupId = "mygroup2")
    public void listener (String message) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Message tempMessage = objectMapper.readValue(message, Message.class);


        System.out.println("Listener recieved  message "  + tempMessage.getText() + " !!! " + tempMessage.getTitle());
    }

}
