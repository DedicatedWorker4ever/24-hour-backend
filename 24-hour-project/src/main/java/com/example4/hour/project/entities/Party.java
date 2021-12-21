package com.example4.hour.project.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table
public class Party {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int partyId;

   @Column(nullable = false,length = 50)
    String partyName;

    @Column(nullable = false,length = 50)
    int numberOfVotes;

    @OneToMany(mappedBy = "party", cascade = CascadeType.ALL)
    @JsonManagedReference
   // @JoinColumn(name ="pk_fk", nullable = false)
    List<Candidate> candidates;

    public Party(String partyName,  int numberOfVotes) {
        this.partyName = partyName;
        this.numberOfVotes = numberOfVotes;
    }

    public Party(){}
}
