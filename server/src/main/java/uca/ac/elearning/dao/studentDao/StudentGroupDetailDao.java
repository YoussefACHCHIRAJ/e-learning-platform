package uca.ac.elearning.dao.studentDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.student.StudentGroupDetail;

import java.util.List;


@Repository
public interface StudentGroupDetailDao extends JpaRepository<StudentGroupDetail, Long> {
    List<StudentGroupDetail> findByActive(boolean active);
}
