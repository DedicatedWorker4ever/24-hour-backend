package com.example4.hour.project.service;

import com.example4.hour.project.dtos.CandidateDTO;
import com.example4.hour.project.entities.Candidate;
import com.example4.hour.project.repository.CandidateRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CandidateService {

    CandidateRepository candidateRepository;

    public CandidateService(CandidateRepository candidateRepository){
        this.candidateRepository = candidateRepository;
    }

    public List<CandidateDTO> getCandidates() {
        Iterable<Candidate> candidates = candidateRepository.findAll();
        return CandidateDTO.CandidateDTOSfromCandidate(candidates);
    }

    public CandidateDTO getCandidate(int candidateId) {

        Candidate candidate = candidateRepository.findById(candidateId).orElseThrow();
        return new CandidateDTO(candidate);
    }

    public CandidateDTO addCandidate(CandidateDTO newCandidate){
        Candidate candidateCreation = CandidateDTO.candidateFromCandidateDTO(newCandidate);
        return new CandidateDTO(candidateRepository.save(candidateCreation));
    }

    public CandidateDTO editCandidate(CandidateDTO candidateToEdit, int candidateId){
        Candidate candidateRemade = candidateRepository.findById(candidateId).orElseThrow();
        candidateRemade.setFirstName(candidateToEdit.getFirstName());
        candidateRemade.setSecondName(candidateToEdit.getSecondName());
        candidateRemade.setCandidateVotes(candidateToEdit.getCandidateVotes());
        return new CandidateDTO(candidateRepository.save(candidateRemade));
    }

    public void deleteCandidate(int candidateId){
        candidateRepository.deleteById(candidateId);
    }

    public List<CandidateDTO> getCandidateByPartyId (int partyId){
        return CandidateDTO.CandidateDTOSfromCandidate(candidateRepository.findCandidatesByParty(partyId));
    }


}
