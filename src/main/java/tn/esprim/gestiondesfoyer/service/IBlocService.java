package tn.esprim.gestiondesfoyer.service;

import tn.esprim.gestiondesfoyer.entities.Bloc;

import java.util.List;

public interface IBlocService {
    List<Bloc> retrieveAllBloc();

    Bloc retrieveBloc(Long id);

    Bloc addBloc(Bloc b);

    void removeBloc(Long id);

    Bloc modifyBloc(Bloc b);
}