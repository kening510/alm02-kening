package com.example.tellmyfuture.service;

import com.example.tellmyfuture.domain.PersonEntity;
import com.example.tellmyfuture.respository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public List<PersonEntity> getPersonList(){
        return personRepository.findAll();
    }

    public Optional<PersonEntity> getAPerson(long id){
        return personRepository.findById(id);
    }

    public int getRandomNumber(){
        Random random = new Random();
        return random.nextInt();
    }
}
