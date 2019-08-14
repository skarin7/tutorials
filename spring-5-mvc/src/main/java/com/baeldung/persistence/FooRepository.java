package com.baeldung.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.baeldung.model.Foo;

public interface FooRepository extends  MongoRepository<Foo, Long> {
	
}
