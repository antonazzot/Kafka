package KafkaProject.Kafka;

import KafkaProject.Kafka.model.Message;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

import java.io.ObjectOutputStream;

//@EnableConfigurationProperties
@SpringBootApplication
public class KafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaApplication.class, args);

	}
	@Bean
	CommandLineRunner commandLineRunner (KafkaTemplate <String, Message> kafkaObjectTemplate) {
		return args -> {

			for (int i = 0; i < 1000000; i++) {

				kafkaObjectTemplate.send("messagetopic", new Message("Topic", "TEXT"));

//				kafkaObjectTemplate.send("messagetopic", Message.builder().text("test text").build());
				Thread.sleep(300);
			}
		};
	}

}
