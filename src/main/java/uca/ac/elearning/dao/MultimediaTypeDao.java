package uca.ac.elearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import uca.ac.elearning.bean.MultimediaType;

public interface MultimediaTypeDao extends JpaRepository<MultimediaType,Long> {

    MultimediaType FindByLibelle(String libelle);
    MultimediaType FindByCode(String code);
    int DeleteByCode(String code);
    int DeleteByLibelle(String libelle);
}
