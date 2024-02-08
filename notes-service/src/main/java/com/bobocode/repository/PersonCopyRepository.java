package com.bobocode.repository;

import com.bobocode.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonCopyRepository extends JpaRepository<Person, Long> {
}
