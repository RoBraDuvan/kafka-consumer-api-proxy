package kakfa.kakfa.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenKafka {
  @KafkaListener(topics = "topic-prueba", groupId = "group-topic-prueba")
  public void listen( ConsumerRecord <String, Object> message ) {
    System.out.println( message.value() + " " + message.timestamp() );
  }

//  @KafkaListener(topics = "topic-prueba", groupId = "group-topic-prueba")
//  public void listen2( ConsumerRecord <String, Object> message ) {
//    System.out.println( message.value() );
//    System.out.println( message.timestamp() );
//  }
}
