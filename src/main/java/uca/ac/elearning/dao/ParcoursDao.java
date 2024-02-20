package uca.ac.elearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import uca.ac.elearning.bean.Parcours;

public interface ParcoursDao extends JpaRepository<Parcours, Long> {
    Parcours findByLibelle(String Libelle);
    Parcours findByEtatParcoursCode(String code);
}
