package com.kbinder.kafka_binder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * Dummy restController.
 *
 * @author Johnny Xavier
 */
@RestController
@RequestMapping( produces = "application/json" )
public class HelloController
{
    @GetMapping(path = "/hello")
    public Mono<String> getHello()
    {
        return Mono.just( "{\"Hello\": \"World\"}" );
    }
}
