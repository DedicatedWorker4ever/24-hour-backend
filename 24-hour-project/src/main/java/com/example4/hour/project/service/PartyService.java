package com.example4.hour.project.service;

import com.example4.hour.project.dtos.PartyDTO;
import com.example4.hour.project.entities.Party;
import com.example4.hour.project.repository.PartyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartyService {

    PartyRepository partyRepository;

    public PartyService (PartyRepository partyRepository){ this.partyRepository = partyRepository;}

    public List<PartyDTO> getParties() {
        Iterable<Party> parties = partyRepository.findAll();
        return PartyDTO.partyDTOSfromParty(parties);
    }


}
