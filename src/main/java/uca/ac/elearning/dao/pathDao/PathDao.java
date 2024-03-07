package uca.ac.elearning.dao.pathDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.path.Path;

import java.util.List;

@Repository
public interface PathDao extends JpaRepository<Path, Long> {
    Path findByLabel(String label);

    List<Path> findByPathStatusCode(String code);

    List<Path> findByAdmin_Username(String username);

    int deleteByPathStatusCode(String code);

    int deleteByLabel(String label);
}
