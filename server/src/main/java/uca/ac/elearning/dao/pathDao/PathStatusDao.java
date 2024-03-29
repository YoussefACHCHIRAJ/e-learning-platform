package uca.ac.elearning.dao.pathDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.path.PathStatus;

@Repository
public interface PathStatusDao extends JpaRepository<PathStatus, Long> {
    PathStatus findByCode(String code);

    PathStatus findByLabel(String label);

    int deleteByLabel(String label);

    int deleteByCode(String code);
}
