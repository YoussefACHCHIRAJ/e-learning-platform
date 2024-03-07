package uca.ac.elearning.dao.studentDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.path.Course;
import uca.ac.elearning.bean.student.StudentInscription;

import java.util.List;

@Repository
public interface StudentInscriptionDao extends JpaRepository<StudentInscription, Long> {
    StudentInscription findByStudentUsername(String userName);

    StudentInscription findByStudentId(Long id);

    List<StudentInscription> findByCurrentCourse(Course currentCourse);

    List<StudentInscription> findByStudentGroupId(Long id);

}
