package co.develhope.DependencyInjection.services;

import co.develhope.DependencyInjection.utils.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MyService {


    private MyComponent myComponent;

    @Autowired
    public MyService(MyComponent myComponent) {
        this.myComponent = myComponent;
        System.out.println("\nMyService has been called");
    }

    public String getName() {
        return "\nMyService.getName() has been called: " + myComponent.getMyComponentName();
    }
}
