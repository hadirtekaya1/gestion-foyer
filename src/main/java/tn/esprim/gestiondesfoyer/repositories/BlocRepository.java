package tn.esprim.gestiondesfoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprim.gestiondesfoyer.entities.Bloc;
import tn.esprim.gestiondesfoyer.entities.Chambre;
import org.springframework.stereotype.Repository;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {

}
