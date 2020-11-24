package com.emse.spring.faircorp;

import org.springframework.boot.CommandLineRunner;

public class FaircorpApplicationConfig {
    // (2)
    public CommandLineRunner greetingCommandLine() { // (3)
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                // (4)
            }
        };
    }
}
