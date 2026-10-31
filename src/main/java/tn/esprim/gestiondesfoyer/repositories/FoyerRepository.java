package tn.esprim.gestiondesfoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprim.gestiondesfoyer.entities.Chambre;
import org.springframework.stereotype.Repository;
import tn.esprim.gestiondesfoyer.entities.Foyer;

@Repository
public interface FoyerRepository extends JpaRepository<Foyer,Long> {

}
