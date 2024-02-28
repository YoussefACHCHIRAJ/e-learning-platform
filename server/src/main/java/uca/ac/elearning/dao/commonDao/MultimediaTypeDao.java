package uca.ac.elearning.dao.commonDao;

import org.springframework.data.jpa.repository.JpaRepository;
import uca.ac.elearning.bean.common.MultimediaType;

public interface MultimediaTypeDao extends JpaRepository<MultimediaType, Long> {

    MultimediaType FindByLabel(String label);

    MultimediaType FindByCode(String code);

    int DeleteByCode(String code);

    int DeleteByLabel(String label);
}
