package uca.ac.elearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.DisponibiliteProfDetail;

import java.util.List;

@Repository
public interface DisponibiliteProfDetailDao extends JpaRepository<DisponibiliteProfDetail, Long> {

    List<DisponibiliteProfDetail> findByDisponibiliteProf_Id(Long id);
    List<DisponibiliteProfDetail> findByDisponibiliteProf_Prof_Username(String username);
}
