package com.thinugigs.first.webservice.restfullwebservice.helloWorld;

import com.thinugigs.first.webservice.restfullwebservice.helloWorld.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello-world")
    public String HelloWorld() {
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean HelloWorldBean() {
        return new HelloWorldBean("Hello World");
    }

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean HelloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean("Hello World " + name);
    }
}
