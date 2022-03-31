package KafkaProject.Kafka.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serializer;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class Message implements Serializable, Serializer, Deserializer {
     String text;
     String title;

     @Override
     public void configure(Map configs, boolean isKey) {
     }

     @Override
     public byte[] serialize(String s, Object o) {

          return new byte[0];
     }

     @Override
     public byte[] serialize(String topic, Headers headers, Object data) {
          return Serializer.super.serialize(topic, headers, data);
     }

     @Override
     public Object deserialize(String s, byte[] bytes) {
          return null;
     }

     @Override
     public Object deserialize(String topic, Headers headers, byte[] data) {
          return Deserializer.super.deserialize(topic, headers, data);
     }

     @Override
     public void close() {
          Serializer.super.close();
     }
}
