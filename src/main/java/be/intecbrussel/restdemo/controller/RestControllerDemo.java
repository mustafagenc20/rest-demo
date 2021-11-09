package be.intecbrussel.restdemo.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestControllerDemo {
    // Communication in the application             : method-calls
    // Communication from outside the application   : HttpRequests
    // HttpRequest-header contains 2 parts:         : verb/method & url

    // https://portal.intecbrussel.be/api/v1/webadmin/courses
    // protocol://server-address(:port)/application-path

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloWorldGet(){
        System.out.println("Hello World (GET) method called...");
        return "Hello World (GET)";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String helloWorldPost(){
        System.out.println("Hello World (POST) method called...");
        return "Hello World (POST)";
    }

    @RequestMapping(value = "/goodbye", method = RequestMethod.POST)
    public String goodByeCruelWorld(){
        System.out.println("Goodbye world method called");
        return "Time to end it all";
    }

    @RequestMapping("/goodbye/hello")
    public String goodByeHello(){
        System.out.println("Goodbye/hello world method called");
        return "I am confused...";
    }

    @RequestMapping(value = "/puttest", method = RequestMethod.PUT)
    @PutMapping("/puttest")
    public String puTesting(){
        System.out.println("putMethod called");
        return "put-method";
    }
    // Responses will be made in the form           : HttpResponse
}
