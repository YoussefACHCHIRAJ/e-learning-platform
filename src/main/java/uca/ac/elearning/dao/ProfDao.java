package uca.ac.elearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.Prof;

@Repository
public interface ProfDao extends JpaRepository<Prof, Long> {

    Prof findByUsername(String username);

    Prof findByEmail(String email);

}
