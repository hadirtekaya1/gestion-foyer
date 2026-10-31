package tn.esprim.gestiondesfoyer.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprim.gestiondesfoyer.entities.Bloc;
import tn.esprim.gestiondesfoyer.repositories.BlocRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class BlocService implements IBlocService {

    private final BlocRepository blocRepository;

    @Override
    public List<Bloc> retrieveAllBloc() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc retrieveBloc(Long id) {
        return blocRepository.findById(id).orElse(null);
    }

    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public void removeBloc(Long id) {
        blocRepository.deleteById(id);
    }

    @Override
    public Bloc modifyBloc(Bloc b) {
        return blocRepository.save(b);
    }
}