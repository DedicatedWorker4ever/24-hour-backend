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
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PartyDTO {

    int partyId;
    String partyName;
    int numberOfVotes;


    public PartyDTO (Party party){
        this.partyId = getPartyId();
        this.partyName = party.getPartyName();
        this.numberOfVotes = party.getNumberOfVotes();
    }

    public PartyDTO (String partyName, int numberOfVotes){
        this.partyName = partyName;
        this.numberOfVotes = numberOfVotes;
    }

    public static List<PartyDTO> partyDTOSfromParty(Iterable<Party> parties){
        List<PartyDTO> dtos = StreamSupport.stream(parties.spliterator(), false)
                .map(party -> new PartyDTO(party))
                .collect(Collectors.toList());
        return dtos;
    }

    public static Party partyFromPartyDTO(PartyDTO party){
        return new Party(party.getPartyName(),party.getNumberOfVotes());
    }


}
