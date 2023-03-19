package com.example.admit.repositories;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.admit.models.admitForm;


public interface AdmitFormRepository extends MongoRepository<admitForm, String>{
    
    @Query("{ name : { $regex : ?0, $options: 'i' } }")
     List<admitForm> getExistingRecords(String name);
}
