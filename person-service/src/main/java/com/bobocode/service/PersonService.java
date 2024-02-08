package com.bobocode.service;

import com.bobocode.domain.Person;
import com.bobocode.event.PersonUpdatedEvent;
import com.bobocode.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;
    private final StreamBridge streamBridge;

    public void updatePerson(Person person) {
        personRepository.save(person); //update in local DB
        //publish event (message) that person with current id has been updated
        streamBridge.send("persons-topic", new PersonUpdatedEvent(person.getId()));
    }
}
