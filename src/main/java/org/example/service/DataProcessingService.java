package org.example.service;

import lombok.AllArgsConstructor;
import org.example.domain.User;

import java.util.List;

@AllArgsConstructor
public class DataProcessingService {
    private final StringPreparationService stringPreparationService;

    public List<String> process(final List<User> users){
        return null;
    }
}
