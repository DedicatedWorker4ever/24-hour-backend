package com.example4.hour.project.rest;

import com.example4.hour.project.dtos.PartyDTO;
import com.example4.hour.project.service.PartyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/parties")
public class PartyController {

    PartyService partyService;

    public PartyController(PartyService partyService){this.partyService = partyService; }

    @GetMapping("/get-all")
    @ResponseBody
    List<PartyDTO> getParties() {
        return partyService.getParties();
    }
}
