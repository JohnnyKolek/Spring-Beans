package org.example.service;

import lombok.AllArgsConstructor;
import org.example.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
public class MainProcessor {
    private final DataRepository dataRepository;
    private final DataProcessingService dataProcessingService;

    public void calculate(){
        List<User> users = dataRepository.readUsers();
        List<String> processed = dataProcessingService.process(users);
        dataRepository.save(processed);
    }
}
