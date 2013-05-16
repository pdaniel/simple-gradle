package com.gopivotal.soleng.examples.simple.gradle;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public Greeting createGreeting(String greeting) {
        return new Greeting(greeting);
    }

}
