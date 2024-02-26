package uca.ac.elearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import uca.ac.elearning.bean.MultimediaType;

public interface MultimediaTypeDao extends JpaRepository<MultimediaType, Long> {

    MultimediaType FindByLabel(String label);

    MultimediaType FindByCode(String code);

    int DeleteByCode(String code);

    int DeleteByLabel(String label);
}
