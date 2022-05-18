package co.develhope.DependencyInjection.utils;

import org.springframework.stereotype.Component;


@Component
public class MyComponent {


    private String myComponentName;

    public MyComponent(){
        this.myComponentName = "Sonia";
        System.out.println("\nMyComponent has been called");
    }

    public String getMyComponentName() {
        return "\nMyComponent.getMyComponentName has been called" + myComponentName;
    }
}
