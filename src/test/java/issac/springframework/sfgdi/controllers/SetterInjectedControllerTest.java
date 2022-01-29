package issac.springframework.sfgdi.controllers;

import issac.springframework.sfgdi.services.PropertyGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by @author issaclee725 on 28/01/2022
 */
class SetterInjectedControllerTest {
    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new PropertyGreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}