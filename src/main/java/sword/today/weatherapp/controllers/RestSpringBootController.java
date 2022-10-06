package sword.today.weatherapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class RestSpringBootController {

    @RequestMapping("/")
    public String hello() {
        return "Hello there";
    }
}
