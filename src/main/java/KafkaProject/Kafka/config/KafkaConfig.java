package KafkaProject.Kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {
    @Bean
    public NewTopic firstTopic (){
        return TopicBuilder.name("firsttopic").build();
    }

    @Bean
    public NewTopic secondTopic () {
    return TopicBuilder.name("secondtopic").build();
    }
}
