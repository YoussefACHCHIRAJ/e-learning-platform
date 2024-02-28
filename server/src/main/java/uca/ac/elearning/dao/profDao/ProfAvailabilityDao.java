package uca.ac.elearning.dao.profDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.prof.ProfAvailability;


@Repository
public interface ProfAvailabilityDao extends JpaRepository<ProfAvailability, Long> {

    ProfAvailability findByProfUsername(String username);

    int deleteByProfUsername(String username);
}
