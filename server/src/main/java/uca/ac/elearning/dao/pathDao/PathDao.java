package uca.ac.elearning.dao.pathDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.path.Path;

import java.util.List;

@Repository
public interface PathDao extends JpaRepository<Path, Long> {

    Path findByCode(String code);

    int deleteByCode(String code);

}
