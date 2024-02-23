package uca.ac.elearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.Cours;
import uca.ac.elearning.bean.Etudiant;
import uca.ac.elearning.bean.InscriptionEtudiant;

import java.util.List;

@Repository
public interface InscriptionEtudiantDao extends JpaRepository<InscriptionEtudiant, Long> {
    InscriptionEtudiant findByEtudiantUsername(String userName);

    InscriptionEtudiant findByCoursActuel(Cours coursActuel);

    List<InscriptionEtudiant> findByEtudiantId(Long id);
    List<InscriptionEtudiant> findByGroupeEtudiantId(Long id);

}
