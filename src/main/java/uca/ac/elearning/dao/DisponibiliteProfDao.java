package uca.ac.elearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.DisponibiliteProf;




@Repository
public interface DisponibiliteProfDao extends JpaRepository {

    DisponibiliteProf findByProfUsername(String username);

    int deleteByProfUsername(String username);
}
