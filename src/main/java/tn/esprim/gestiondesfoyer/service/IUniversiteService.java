package tn.esprim.gestiondesfoyer.service;

import tn.esprim.gestiondesfoyer.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite> retrieveAllUniversite();

    Universite retrieveUniversite(Long id);

    Universite addUniversite(Universite u);

    void removeUniversite(Long id);

    Universite modifyUniversite(Universite u);
}