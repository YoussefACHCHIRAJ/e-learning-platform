package uca.ac.elearning.dao;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.Category;
import uca.ac.elearning.bean.Section;

import java.util.List;

@Repository
public interface SectionDao extends JpaRepository<Section,Long> {
    Section findByLibelle(String libelle);
    List<Section> findByCours_Id(Long id);

    int deleteByCours_Id(Long libelle);

    int deleteByLibelle(String libelle);





}
