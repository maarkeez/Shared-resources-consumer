package dmd.consumer.resources;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Slf4j
@Service
public class PrinterService {

    @Value("${my.value}")
    private String value;

    @PostConstruct
    public void init(){
        log.info("My value: {}", value);
    }
}
