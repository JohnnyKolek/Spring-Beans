package org.example.service;

import org.example.domain.User;
import org.springframework.stereotype.Service;

@Service
public class StringPreparationService {
    public String prepare(final User user){
        return String.format("%s;%s", user.getBirthDate(), user.getEmail());
    }
}
