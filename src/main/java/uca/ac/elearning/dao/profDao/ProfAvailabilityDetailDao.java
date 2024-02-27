package uca.ac.elearning.dao.profDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.prof.ProfAvailabilityDetail;

import java.util.List;

@Repository
public interface ProfAvailabilityDetailDao extends JpaRepository<ProfAvailabilityDetail, Long> {

    List<ProfAvailabilityDetail> findByProfAvailability_Id(Long id);

    List<ProfAvailabilityDetail> findByProfAvailability_Prof_Username(String username);
}
