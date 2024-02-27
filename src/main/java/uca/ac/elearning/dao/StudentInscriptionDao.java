package uca.ac.elearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.Course;
import uca.ac.elearning.bean.StudentInscription;

import java.util.List;

@Repository
public interface StudentInscriptionDao extends JpaRepository<StudentInscription, Long> {
    StudentInscription findByStudentUsername(String userName);

    StudentInscription findByStudentId(Long id);

    List<StudentInscription> findByCurrentCourse(Course currentCourse);

    List<StudentInscription> findByStudentGroupId(Long id);

}
