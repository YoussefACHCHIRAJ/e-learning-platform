package uca.ac.elearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.GroupeEtudiantDetail;

import java.util.List;


@Repository
public interface GroupeEtudiantDetailDao extends JpaRepository<GroupeEtudiantDetail,Long> {
     List<GroupeEtudiantDetail> findByIsActive(boolean isActive);
}
