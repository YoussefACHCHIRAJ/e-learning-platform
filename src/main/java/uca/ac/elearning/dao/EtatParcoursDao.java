package uca.ac.elearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import uca.ac.elearning.bean.EtatParcours;

public interface EtatParcoursDao extends JpaRepository<EtatParcours, Long> {
    EtatParcours findByCode(String code);
    EtatParcours findByLibelle(String libelle);
}
