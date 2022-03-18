package org.ebullq.boldlama.service;

import lombok.extern.slf4j.Slf4j;
import org.ebullq.boldlama.model.Greeting;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * @author mkukharchuk 18.03.2022
 */
@Slf4j
@Service
public class HelloService {

    private static final String HELLO_MESSAGE = "Hello world";

    public Mono<Greeting> getGreetings() {
        Greeting hello = new Greeting(HELLO_MESSAGE);
        log.info("Hello message generated: {}", hello);
        return Mono.just(hello);
    }
}
