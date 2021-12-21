package com.example4.hour.project.dtos;

import com.example4.hour.project.entities.Candidate;
import com.example4.hour.project.entities.Party;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CandidateDTO {

    int candidateId;
    String firstName;
    String secondName;
    int candidateVotes;
  //  @JsonIgnore
    Party party;

    public CandidateDTO(Candidate candidate){
        this.firstName = candidate.getFirstName();
        this.secondName = candidate.getSecondName();
        this.candidateVotes = candidate.getCandidateVotes();
        this.party = candidate.getParty();
        this.candidateId = candidate.getCandidateId();
    }

    public CandidateDTO (String firstName, String secondName,  int candidateVotes, Party party){
        this.firstName = firstName;
        this.secondName = secondName;
        this.candidateVotes = candidateVotes;
        this.party = party;
    }


    public static List<CandidateDTO> CandidateDTOSfromCandidate(Iterable<Candidate> candidates){
        List<CandidateDTO> dtos = StreamSupport.stream(candidates.spliterator(), false)
                .map(candidate -> new CandidateDTO(candidate))
                .collect(Collectors.toList());
        return dtos;
    }

    public static Candidate candidateFromCandidateDTO(CandidateDTO candidate){
        return new Candidate(candidate.getFirstName(),candidate.getSecondName(), candidate.getCandidateVotes(), candidate.getParty());
    }

}
