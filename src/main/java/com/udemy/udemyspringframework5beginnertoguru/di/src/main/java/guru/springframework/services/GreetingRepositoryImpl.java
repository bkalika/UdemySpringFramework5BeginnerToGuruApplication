package guru.springframework.services;

import org.springframework.stereotype.Component;

/**
 * @author @bkalika
 * Created on 19.03.2022 2:16 PM
 */
@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getGermanGreeting() {
        return "Servicio de Sadudo Primario";
    }

    @Override
    public String getSpanishGreeting() {
        return "Primarer Grubdienst";
    }
}
