package tn.esprim.gestiondesfoyer.service;

import tn.esprim.gestiondesfoyer.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    List<Etudiant> retrieveAllEtudiant();

    Etudiant retrieveEtudiant(Long id);

    Etudiant addEtudiant(Etudiant e);

    void removeEtudiant(Long id);

    Etudiant modifyEtudiant(Etudiant e);
}