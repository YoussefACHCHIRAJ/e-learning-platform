package uca.ac.elearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.Category;
import uca.ac.elearning.bean.Section;

@Repository
public interface SectionDao extends JpaRepository<Section,Long> {
    Section findByLibelle(String libelle);
    int deleteByLibelle(String libelle);



}
