package ma.enset.tp02part02.repository;

import ma.enset.tp02part02.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {

}