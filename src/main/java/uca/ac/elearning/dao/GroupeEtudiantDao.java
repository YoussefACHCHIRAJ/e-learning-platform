package uca.ac.elearning.dao;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.GroupeEtudiant;
import uca.ac.elearning.bean.Section;

import java.util.List;

@Repository
public interface GroupeEtudiantDao extends JpaRepository<GroupeEtudiant, Long> {
    GroupeEtudiant findByLibelle(String libelle);

    List<GroupeEtudiant> findByProfUsername(String username);
    List<GroupeEtudiant> findByParcoursLibelle(String libelle);

    int deleteByLibelle(String libelle);

}
