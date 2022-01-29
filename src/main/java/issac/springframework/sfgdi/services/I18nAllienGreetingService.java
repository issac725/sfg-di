package issac.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by @author issaclee725 on 29/01/2022
 */
@Profile("AL")
@Service("i18nService")
public class I18nAllienGreetingService implements GreetingService{


    @Override
    public String sayGreeting() {
        return "Hello, Allien";
    }
}
