package issac.springframework.sfgdi.controllers;

import issac.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

/**
 * Created by @author issaclee725 on 28/01/2022
 */
@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController( GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
