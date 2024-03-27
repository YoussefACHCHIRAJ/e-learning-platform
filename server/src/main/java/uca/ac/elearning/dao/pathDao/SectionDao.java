package uca.ac.elearning.dao.pathDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.path.Section;

import java.util.List;

@Repository
public interface SectionDao extends JpaRepository<Section, Long> {
    Section findByLabel(String label);

    List<Section> findByCourse_Id(Long id);
    
    List<Section> findByCategorySectionLabel(String label);

    int deleteByCourse_Id(Long id);

    int deleteByLabel(String label);


}
