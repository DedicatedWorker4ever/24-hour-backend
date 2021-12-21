package com.example4.hour.project.rest;

import com.example4.hour.project.dtos.CandidateDTO;
import com.example4.hour.project.entities.Candidate;
import com.example4.hour.project.service.CandidateService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/candidates")
public class CandidateController {

    CandidateService candidateService;
    public CandidateController (CandidateService candidateService){this.candidateService = candidateService;}

    @GetMapping("/getCandidates")
    @ResponseBody
    List<CandidateDTO> getCandidates() {
        return candidateService.getCandidates();
    }

    @GetMapping("/getCandidateById/{candidateId}")
    CandidateDTO getCandidate(@PathVariable int candidateId) {

        return candidateService.getCandidate(candidateId);
    }

    @PostMapping("/addCandidate")
    CandidateDTO addCandidate(@RequestBody CandidateDTO newCandidate) {
        return candidateService.addCandidate(newCandidate);
    }

    @PutMapping(value = "/editCandidate/{candidateId}", consumes = MediaType.APPLICATION_JSON_VALUE)
    CandidateDTO editCandidate(@RequestBody CandidateDTO candidateToEdit,@PathVariable int candidateId ) throws Exception {
        return candidateService.editCandidate(candidateToEdit,candidateId);
    }

    @DeleteMapping("/deleteCandidate/{candidateId}")
    void deleteCandidate(@PathVariable int candidateId){
        candidateService.deleteCandidate(candidateId);

    }

    @GetMapping("/getCandidates/{partyId}")
    @ResponseBody
    List<CandidateDTO> getCandidateByPartyId (@PathVariable int partyId){
        return candidateService.getCandidateByPartyId(partyId);
    }
}
