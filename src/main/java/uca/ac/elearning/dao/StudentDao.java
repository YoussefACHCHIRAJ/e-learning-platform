package uca.ac.elearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.Student;

@Repository
public interface StudentDao extends JpaRepository<Student,Long> {
       Student findByUsername(String userName);
       Student findByEmail(String email);

}
