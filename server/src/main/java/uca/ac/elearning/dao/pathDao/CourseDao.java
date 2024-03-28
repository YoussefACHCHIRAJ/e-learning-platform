package uca.ac.elearning.dao.pathDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.path.Course;

import java.util.*;

@Repository
public interface CourseDao extends JpaRepository<Course, Long> {
    Course findByCode(String code);

    int deleteByCode(String code);

}
