package uca.ac.elearning.dao.commonDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.common.MultimediaType;

@Repository
public interface MultimediaTypeDao extends JpaRepository<MultimediaType, Long> {

    MultimediaType findByLabel(String label);

    MultimediaType findByCode(String code);

    int deleteByCode(String code);

    int deleteByLabel(String label);
}
