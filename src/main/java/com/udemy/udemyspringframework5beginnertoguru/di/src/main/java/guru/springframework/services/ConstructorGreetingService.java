package guru.springframework.services;

import org.springframework.stereotype.Service;

/**
 * @author @bkalika
 * Created on 19.03.2022 1:54 PM
 */
@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello, I was injected by constructor.";
    }
}
