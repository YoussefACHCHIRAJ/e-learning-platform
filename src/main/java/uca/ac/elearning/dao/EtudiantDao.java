package uca.ac.elearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.Etudiant;

import java.util.List;

@Repository
public interface EtudiantDao extends JpaRepository<Etudiant,Long> {
       Etudiant findByUsername(String userName);
       Etudiant findByEmail(String email);

}
