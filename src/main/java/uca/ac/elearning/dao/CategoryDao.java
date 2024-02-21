package uca.ac.elearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.Category;

@Repository
public interface CategoryDao extends JpaRepository<Category, Long> {

    Category findByCode(String code);
    int deleteByCode(String code);
}
