package uca.ac.elearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uca.ac.elearning.bean.StudentGroup;

import java.util.List;

@Repository
public interface StudentGroupDao extends JpaRepository<StudentGroup, Long> {
    StudentGroup findByLabel(String label);

    List<StudentGroup> findByProfUsername(String username);

    List<StudentGroup> findByPathLabel(String label);

    List<StudentGroup> findByStudentGroupDetailId(Long id);

    int deleteByLabel(String label);

}
