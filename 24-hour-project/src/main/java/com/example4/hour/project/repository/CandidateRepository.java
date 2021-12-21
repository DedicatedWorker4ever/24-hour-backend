package com.example4.hour.project.repository;

import com.example4.hour.project.entities.Candidate;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CandidateRepository extends CrudRepository<Candidate, Integer> {
    @Query(value = "SELECT * FROM candidate WHERE party_id = ?1",
            nativeQuery = true)
    List<Candidate> findCandidatesByParty(int partyId);
}
