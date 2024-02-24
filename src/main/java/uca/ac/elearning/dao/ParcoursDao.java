package uca.ac.elearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.Parcours;

import java.util.List;

@Repository
public interface ParcoursDao extends JpaRepository<Parcours, Long> {
    Parcours findByLibelle(String Libelle);
    List<Parcours> findByEtatParcoursCode(String code);
    List<Parcours> findByAdmin_Username(String username);

    int deleteByEtatParcoursCode(String code);

    int deleteByLibelle(String libelle);
}
