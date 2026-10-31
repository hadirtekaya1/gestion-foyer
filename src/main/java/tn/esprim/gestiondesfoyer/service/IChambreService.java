package tn.esprim.gestiondesfoyer.service;

import tn.esprim.gestiondesfoyer.entities.Chambre;

import java.util.List;

public interface IChambreService {
    public List<Chambre> retrieveAllChambre();
    public Chambre retrieveChambre (Long chambreId);
    public Chambre  addChambre (Chambre c);
    public void removeChambre(Long chambreId);
    public Chambre modifyChambre(Chambre chambre);
}
