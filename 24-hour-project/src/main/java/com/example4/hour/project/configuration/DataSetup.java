package com.example4.hour.project.configuration;

import com.example4.hour.project.entities.Candidate;
import com.example4.hour.project.entities.Party;
import com.example4.hour.project.repository.CandidateRepository;
import com.example4.hour.project.repository.PartyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("!test")
public class DataSetup implements CommandLineRunner {

    CandidateRepository candidateRepository;
    PartyRepository partyRepository;

    public DataSetup(CandidateRepository candidateRepository, PartyRepository partyRepository){
        this.candidateRepository = candidateRepository;
        this.partyRepository = partyRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Party party1 = new Party("A - Socialdemokratiet",1);
        Party party2 = new Party("C - Det konservative Folkeparti",0);
        Party party3 = new Party("F - SF, Socialistisk Folkeparti",0);
        Party party4 = new Party("O - Dansk Folkeparti",0);
        Party party5 = new Party("V - Venstre, Danmarks Liberale Parti",0);
        Party party6 = new Party("Ø - Enhedslisten + De Rød Grønne",0);
        partyRepository.save(party1);
        partyRepository.save(party2);
        partyRepository.save(party3);
        partyRepository.save(party4);
        partyRepository.save(party5);
        partyRepository.save(party6);

        Candidate candidate1 = new Candidate("Marcel", "Meijer", 0,party1);
        Candidate candidate2 = new Candidate("Michael", "Kristensen", 0,party1);
        Candidate candidate3 = new Candidate("Helle", "Hansen", 0,party1);
        Candidate candidate4 = new Candidate("Karina", "Knobelauch", 0,party1);
        Candidate candidate5 = new Candidate("Stefan", "Hafstein Wolffbrandt", 0,party1);
        Candidate candidate6 = new Candidate("Robert", "V. Rasmussen", 0,party1);
        Candidate candidate7 = new Candidate("Pia", "Ramsing", 0,party1);
        Candidate candidate8 = new Candidate("Anders", "Baun Sørensen", 0,party1);
        Candidate candidate9 = new Candidate("Per", "Urban Olsen", 0,party2);
        Candidate candidate10 = new Candidate("Peter", "Askjær", 0,party2);
        Candidate candidate11 = new Candidate("Martin", "Sørensen", 0,party2);
        Candidate candidate12 = new Candidate("Louise", "Bramstorp", 0,party2);
        Candidate candidate13 = new Candidate("Sigfred", "Jensen", 0,party2);
        Candidate candidate14 = new Candidate("Jørn", "C. Nissen", 0,party2);
        Candidate candidate15 = new Candidate("Morten", "Ø. Kristensen", 0,party2);
        Candidate candidate16 = new Candidate("Susanne", "Andersen", 0,party2);
        Candidate candidate17 = new Candidate("Iulian", "V. Paiu", 0,party2);
        Candidate candidate18 = new Candidate("Per", "Hingel", 0,party2);
        Candidate candidate19 = new Candidate("Ulla", "Holm", 0,party3);
        Candidate candidate20 = new Candidate("Kjeld", "Bønkel", 0,party3);
        Candidate candidate21 = new Candidate("Anne", "Grethe Olsen", 0,party3);
        Candidate candidate22 = new Candidate("Lone", "Krag", 0,party3);
        Candidate candidate23 = new Candidate("Børge", "S. Buur", 0,party3);
        Candidate candidate24 = new Candidate("Per", "Mortensen", 0,party4);
        Candidate candidate25 = new Candidate("Søren", "Wiese", 0,party5);
        Candidate candidate26 = new Candidate("Anita", "Elgaard Højholt Olesen", 0,party5);
        Candidate candidate27 = new Candidate("Carsten", "Bruun", 0,party5);
        Candidate candidate28 = new Candidate("Mogens", "Exner", 0,party5);
        Candidate candidate29 = new Candidate("Anja", "Guldborg", 0,party5);
        Candidate candidate30 = new Candidate("Klaus", "Holdorf", 0,party5);
        Candidate candidate31 = new Candidate("Katrine", "Høegh Mc Quaid", 0,party6);
        Candidate candidate32 = new Candidate("Jette", "M. Søgaard", 0,party6);
        Candidate candidate33 = new Candidate("Søren", "Caspersen", 0,party6);
        Candidate candidate34 = new Candidate("Pia", "Birkmand", 0,party6);
        candidateRepository.save(candidate1);
        candidateRepository.save(candidate2);
        candidateRepository.save(candidate3);
        candidateRepository.save(candidate4);
        candidateRepository.save(candidate5);
        candidateRepository.save(candidate6);
        candidateRepository.save(candidate7);
        candidateRepository.save(candidate8);
        candidateRepository.save(candidate9);
        candidateRepository.save(candidate10);
        candidateRepository.save(candidate11);
        candidateRepository.save(candidate12);
        candidateRepository.save(candidate13);
        candidateRepository.save(candidate14);
        candidateRepository.save(candidate15);
        candidateRepository.save(candidate16);
        candidateRepository.save(candidate17);
        candidateRepository.save(candidate18);
        candidateRepository.save(candidate19);
        candidateRepository.save(candidate20);
        candidateRepository.save(candidate21);
        candidateRepository.save(candidate22);
        candidateRepository.save(candidate23);
        candidateRepository.save(candidate24);
        candidateRepository.save(candidate25);
        candidateRepository.save(candidate26);
        candidateRepository.save(candidate27);
        candidateRepository.save(candidate28);
        candidateRepository.save(candidate29);
        candidateRepository.save(candidate30);
        candidateRepository.save(candidate31);
        candidateRepository.save(candidate32);
        candidateRepository.save(candidate33);
        candidateRepository.save(candidate34);
    }
}
