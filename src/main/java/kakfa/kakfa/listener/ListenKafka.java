package kakfa.kakfa.listener;

import kakfa.kakfa.dto.LoteDto;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenKafka {

    @KafkaListener(topics = "topic-test", groupId = "group-topic-test")
    public void listen( ConsumerRecord<String, Object> message) {
        System.out.println(message.value() + " " + message.timestamp());
        
        this.someEventOccurred(message);
        
    }

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void someEventOccurred(ConsumerRecord<String, Object> dataToSend) {
        
        LoteDto lote = new LoteDto(dataToSend, "");
        
        eventPublisher.publishEvent(lote);
    }

//  @KafkaListener(topics = "topic-prueba", groupId = "group-topic-prueba")
//  public void listen2( ConsumerRecord <String, Object> message ) {
//    System.out.println( message.value() );
//    System.out.println( message.timestamp() );
//  }
}
