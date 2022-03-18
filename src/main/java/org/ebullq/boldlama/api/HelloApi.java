package org.ebullq.boldlama.api;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.ebullq.boldlama.model.Greeting;
import org.ebullq.boldlama.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import static lombok.AccessLevel.PRIVATE;

/**
 * @author mkukharchuk 18.03.2022
 */
@RestController
@RequestMapping("/hello")
@RequiredArgsConstructor
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class HelloApi {

    HelloService helloService;

    @GetMapping
    public Mono<Greeting> getAllUsers(){
        return helloService.getGreetings();
    }
}
