package uca.ac.elearning.dao.studentDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.student.StudentInscription;

@Repository
public interface StudentInscriptionDao extends JpaRepository<StudentInscription, Long> {

    StudentInscription findByStudent_email(String studentEmail);
}
