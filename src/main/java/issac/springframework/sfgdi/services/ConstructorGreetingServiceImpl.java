package issac.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by @author issaclee725 on 28/01/2022
 */
@Service
public class ConstructorGreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello - Constructor";
    }
}