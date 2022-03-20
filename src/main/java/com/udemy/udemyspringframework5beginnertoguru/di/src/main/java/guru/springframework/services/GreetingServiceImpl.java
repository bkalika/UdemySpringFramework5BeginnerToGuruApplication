package guru.springframework.services;

import org.springframework.stereotype.Service;

/**
 * @author @bkalika
 * Created on 19.03.2022 2:02 PM
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello Gurus";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
