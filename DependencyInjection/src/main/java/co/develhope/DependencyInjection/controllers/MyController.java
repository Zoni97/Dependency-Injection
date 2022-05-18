package co.develhope.DependencyInjection.controllers;

import co.develhope.DependencyInjection.services.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {

    private MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
        System.out.println("\nMyController constructor has been called");
    }

    @GetMapping("/getName")
    public String getName() {
        return myService.getName();
    }

    @GetMapping
    public String root(){
        return "Welcome!";
    }


}
