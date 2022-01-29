package issac.springframework.sfgdi.controllers;

import issac.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by @author issaclee725 on 29/01/2022
 */
@Controller
public class I18nController {

    private final GreetingService greetingService;


    public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
