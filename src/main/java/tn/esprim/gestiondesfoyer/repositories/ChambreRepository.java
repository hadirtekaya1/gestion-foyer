package tn.esprim.gestiondesfoyer.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprim.gestiondesfoyer.entities.Chambre;
import org.springframework.stereotype.Repository;

@Repository // herite de @componenet
public interface ChambreRepository extends JpaRepository<Chambre,Long> {

}
