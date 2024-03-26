
package kakfa.kakfa.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.kafka.clients.consumer.ConsumerRecord;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoteDto {
    
    private ConsumerRecord<String, Object> data;
    private String endpoint;
    
}
