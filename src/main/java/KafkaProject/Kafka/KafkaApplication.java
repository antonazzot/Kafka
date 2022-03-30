package KafkaProject.Kafka;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

//@EnableConfigurationProperties
@SpringBootApplication
public class KafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaApplication.class, args);

	}
	@Bean
	CommandLineRunner commandLineRunner (KafkaTemplate <String, String> kafkaTemplate) {
		return args -> {
			for (int i = 0; i < 1000000; i++) {
				kafkaTemplate.send("firsttopic", "What you will cooking for dinner, Kit  ? ");
				kafkaTemplate.send("secondtopic", "I want a pork! " );
				Thread.sleep(300);
			}
		};
	}

}
