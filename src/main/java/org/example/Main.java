package org.example;


import org.example.configuration.ApplicationConfiguration;
import org.example.service.MainProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        MainProcessor mainProcessor = context.getBean(MainProcessor.class);
//        MainProcessor mainProcessor = new MainProcessor(
//                new DataRepository(),
//                new DataProcessingService(
//                        new StringPreparationService()
//                )
//        );
        mainProcessor.process();
    }
}
