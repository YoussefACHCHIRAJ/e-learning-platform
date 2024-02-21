package uca.ac.elearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.Etudiant;

@Repository
public interface EtudiantDao extends JpaRepository<Etudiant,Long> {
       Etudiant findByUserName(String userName);
       Etudiant findByEmail(String email);
}
