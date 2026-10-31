package tn.esprim.gestiondesfoyer.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprim.gestiondesfoyer.entities.Chambre;
import tn.esprim.gestiondesfoyer.repositories.ChambreRepository;

import java.util.List;

@Service
//@AllArgsConstructor SI on utlise le constructeur
public class ChambreService implements IChambreService {

    @Autowired
    private ChambreRepository chambreRespository;

    @Override
    public List<Chambre> retrieveAllChambre() {
        return chambreRespository.findAll();
    } //findAll from JpaRepository

    @Override
    public Chambre retrieveChambre(Long chambreId) {
        return chambreRespository.findById(chambreId).get();
    } //retour de findByiD OPTIOSNL get() pour reformuler casting pour le retour

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRespository.save(c);
    }

    @Override
    public void removeChambre(Long chambreId) {
        chambreRespository.deleteById(chambreId);

    }

    @Override
    public Chambre modifyChambre(Chambre chambre) {
        return chambreRespository.save(chambre);
    }

    //save : modifiaction et ajout a la fois s'il existe il l'ajoute sinon il existe il le modifie
}
