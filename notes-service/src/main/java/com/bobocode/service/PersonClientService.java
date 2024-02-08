package com.bobocode.service;

import com.bobocode.repository.PersonCopyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonClientService {
    private final PersonCopyRepository personCopyRepository;

    public void synchronizePersonById(Long personId) {
        // call person service to load fresh person data by id
        // update local person copy
    }
}
