package uca.ac.elearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.Section;

import java.util.List;

@Repository
public interface SectionDao extends JpaRepository<Section, Long> {
    Section findByLabel(String label);

    List<Section> findByCourse_Id(Long id);

    List<Section> findByCategoryLabel(String label);

    int deleteByCourse_Id(Long id);

    int deleteByLabel(String label);


}
