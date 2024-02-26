package uca.ac.elearning.dao;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uca.ac.elearning.bean.Section;
import uca.ac.elearning.bean.StudentGroup;

import java.util.List;

@Repository
public interface StudentGroupDao extends JpaRepository<StudentGroup, Long> {
  StudentGroup findByLibelle(String libelle);

    List<StudentGroup> findByProfUsername(String username);
    List<StudentGroup> findByParcoursLibelle(String libelle);
    List<StudentGroup> findByGroupeEtudiantDetail_Id(Long id);

    int deleteByLibelle(String libelle);

}
