package uca.ac.elearning.dao.pathDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.path.Course;

import java.util.*;

@Repository
public interface CourseDao extends JpaRepository<Course, Long> {
    Course findByLabel(String label);

    int deleteByLabel(String label);

    List<Course> findByPathId(Long id);

    int deleteByPathId(Long id);
}
