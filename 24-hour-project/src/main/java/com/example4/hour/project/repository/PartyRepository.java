package com.example4.hour.project.repository;

import com.example4.hour.project.entities.Party;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartyRepository extends CrudRepository<Party, Integer> {
}
