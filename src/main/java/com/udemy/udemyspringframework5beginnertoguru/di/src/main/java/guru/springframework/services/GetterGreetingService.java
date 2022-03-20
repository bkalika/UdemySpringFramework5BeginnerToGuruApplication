package guru.springframework.services;

import org.springframework.stereotype.Service;

/**
 * @author @bkalika
 * Created on 19.03.2022 2:00 PM
 */
@Service
public class GetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello, I was injected by getter";
    }
}
