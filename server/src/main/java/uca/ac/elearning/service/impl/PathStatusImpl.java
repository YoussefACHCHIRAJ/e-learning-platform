package uca.ac.elearning.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uca.ac.elearning.bean.path.PathStatus;
import uca.ac.elearning.dao.pathDao.PathStatusDao;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PathStatusImpl implements uca.ac.elearning.service.facade.PathStatus {

    private final PathStatusDao pathStatusDao;

    @Override
    public List<PathStatus> findAll(){
        return pathStatusDao.findAll();
    }
}
