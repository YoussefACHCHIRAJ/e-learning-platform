package uca.ac.elearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.InscriptionEtudiant;

import java.util.List;

@Repository
public interface InscriptionEtudiantDao extends JpaRepository<InscriptionEtudiant,Long> {
    List<InscriptionEtudiant> findByEtudiantUsername(String userName);
}
