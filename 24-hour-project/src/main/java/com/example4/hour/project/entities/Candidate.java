package com.example4.hour.project.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int candidateId;

    @Column(nullable = false,length = 50)
    String firstName;

    @Column(nullable = false,length = 50)
    String secondName;

    @Column(nullable = false,length = 50)
    int candidateVotes;


    @ManyToOne
    @JoinColumn(name="party_id")
    @JsonBackReference
    Party party;

    public Candidate (String firstName, String secondName, int candidateVotes, Party party){
        this.firstName = firstName;
        this.secondName = secondName;
        this.candidateVotes = candidateVotes;
        this.party = party;
    }

}
