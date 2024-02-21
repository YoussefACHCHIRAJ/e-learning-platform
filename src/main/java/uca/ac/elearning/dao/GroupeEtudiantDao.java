package uca.ac.elearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.GroupeEtudiant;
import uca.ac.elearning.bean.Section;

@Repository
public interface GroupeEtudiantDao extends JpaRepository<GroupeEtudiant, Long> {
    GroupeEtudiant findByLibelle(String libelle);

    int deleteByLibelle(String libelle);

}
