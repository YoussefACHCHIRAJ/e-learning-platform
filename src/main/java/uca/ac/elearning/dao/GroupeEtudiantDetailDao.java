package uca.ac.elearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.StudentGroupDetail;

import java.util.List;


@Repository
public interface GroupeEtudiantDetailDao extends JpaRepository<StudentGroupDetail,Long> {
     List<StudentGroupDetail> findByIsActive(boolean isActive);
}
