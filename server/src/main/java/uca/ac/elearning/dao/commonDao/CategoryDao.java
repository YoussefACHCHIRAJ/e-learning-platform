package uca.ac.elearning.dao.commonDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.common.CategorySection;

@Repository
public interface CategoryDao extends JpaRepository<CategorySection, Long> {

    CategorySection findByCode(String code);

    int deleteByCode(String code);
}
