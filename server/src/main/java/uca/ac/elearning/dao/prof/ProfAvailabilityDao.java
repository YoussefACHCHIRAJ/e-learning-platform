package uca.ac.elearning.dao.prof;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.prof.ProfAvailability;

import java.util.List;

@Repository
public interface ProfAvailabilityDao extends JpaRepository<ProfAvailability, Long> {

    List<ProfAvailability> findByProf_Email(String email);
}
