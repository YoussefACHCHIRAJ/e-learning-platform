package uca.ac.elearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.Parcours;

@Repository
public interface ParcoursDao extends JpaRepository<Parcours, Long> {
    Parcours findByLibelle(String Libelle);
    Parcours findByEtatParcoursCode(String code);
}
