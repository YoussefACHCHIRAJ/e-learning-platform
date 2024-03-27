package uca.ac.elearning.dao.studentDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uca.ac.elearning.bean.student.StudentGroup;

import java.util.List;

@Repository
public interface StudentGroupDao extends JpaRepository<StudentGroup, Long> {
    StudentGroup findByCode(String code);
    int deleteByCode(String code);
}
