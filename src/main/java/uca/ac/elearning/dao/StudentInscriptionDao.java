package uca.ac.elearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.Cours;
import uca.ac.elearning.bean.StudentInscription;

import java.util.List;

@Repository
public interface StudentInscriptionDao extends JpaRepository<StudentInscription, Long> {
    StudentInscription findByEtudiantUsername(String userName);

    StudentInscription findByCoursActuel(Cours coursActuel);

    StudentInscription findByEtudiantId(Long id);
    List<StudentInscription> findByGroupeEtudiantId(Long id);

}
