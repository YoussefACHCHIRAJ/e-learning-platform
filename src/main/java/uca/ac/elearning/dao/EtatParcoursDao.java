package uca.ac.elearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.EtatParcours;

@Repository
public interface EtatParcoursDao extends JpaRepository<EtatParcours, Long> {
    EtatParcours findByCode(String code);

    EtatParcours findByLibelle(String libelle);

    int deleteByLibelle(String libelle);

    int deleteByCode(String code);
}
