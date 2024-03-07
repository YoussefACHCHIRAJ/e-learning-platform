package uca.ac.elearning.dao.commonDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.common.Day;

@Repository
public interface DayDao extends JpaRepository<Day, Long> {
    Day findByCode(String code);

    int deleteByCode(String code);
}
