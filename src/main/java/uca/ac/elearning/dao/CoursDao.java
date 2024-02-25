package uca.ac.elearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.Cours;

import java.util.*;
@Repository
public interface CoursDao extends JpaRepository<Cours,Long> {
    Cours findByLibelle(String libelle);
    int deleteByLibelle(String libelle);

    List<Cours> findByParcoursId(Long id);
    int deleteByParcoursId(Long id);
}
