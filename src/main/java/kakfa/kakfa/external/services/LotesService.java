package kakfa.kakfa.external.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

//@FeignClient( name = "LOTES-SERVICE", url = "")
public interface LotesService {
    
    @PostMapping("/")
    Object sendLote( @PathVariable Object lote );
    
}
