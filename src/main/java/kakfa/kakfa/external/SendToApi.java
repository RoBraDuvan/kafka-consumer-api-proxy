
package kakfa.kakfa.external;

import kakfa.kakfa.dto.LoteDto;
import kakfa.kakfa.external.services.LotesService;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SendToApi {
    
    private LotesService lotesService;
    
    @EventListener
    public void handleEventExternalAPI( LoteDto lote ){
        
        ConsumerRecord<String, Object> dataToSend = lote.getData();
        String endpoint = lote.getEndpoint();

        System.out.println("Desde SendToAPI: " + dataToSend);
        
        //lotesService.sendLote(lote);
        
    }
    
}
