package com.thkoeln.hct.backend.hctbackend.entity;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "mensch")
public class Mensch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter
    @Getter
    private Integer id;

    @Getter
    @Setter
    @NonNull
    private String geschlecht;
    private Integer old;
    private Double groesse;
    private Date geburtstag;
    //private Long id;


    public Mensch(String geschlecht,Integer alter,Double groesse,Date geburtstag){
       this.geschlecht = geschlecht;
       this.old = alter;
       this.groesse = groesse;
       this.geburtstag = geburtstag;
       //this.id = id;
   }

    public Mensch() {

    }
}