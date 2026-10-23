package tn.esprim.gestiondesfoyer.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Etudiant implements Serializable { //Lorsqu’on veut partager des objets lors de la session finale de POO au format JSON, on utilise une autre forme, et la désérialisation est le processus inverse
    @Id
    private Long idEtudiant;
    @GeneratedValue(strategy =  GenerationType.IDENTITY)

    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;
    private Date dateNaissance;

    @ManyToMany(mappedBy = "etudiants" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    private List<Reservation> reservations ;
    //List<Etudiant> findBy
}
