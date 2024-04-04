package uca.ac.elearning.service.facade;

import uca.ac.elearning.bean.path.PathStatus;

import java.util.List;

public interface PathStatusService {
    List<PathStatus> findAll();
}
