package uca.ac.elearning.dao.prof;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.prof.ProfAvailabilityDetail;

@Repository
public interface ProfAvailabilityDetailsDao extends JpaRepository<ProfAvailabilityDetail, Long> {
}
