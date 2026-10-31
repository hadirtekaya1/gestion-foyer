package tn.esprim.gestiondesfoyer.service;

import tn.esprim.gestiondesfoyer.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    List<Foyer> retrieveAllFoyer();

    Foyer retrieveFoyer(Long id);

    Foyer addFoyer(Foyer f);

    void removeFoyer(Long id);

    Foyer modifyFoyer(Foyer f);
}