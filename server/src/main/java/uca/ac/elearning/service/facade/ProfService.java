package uca.ac.elearning.service.facade;

<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestBody;
import uca.ac.elearning.bean.common.Day;
import uca.ac.elearning.utils.ProfRequest;
import uca.ac.elearning.utils.ProfResponse;

import java.util.List;

public interface ProfService {
    List<Day> findAllDays();

    ProfResponse saveAvailability(@RequestBody ProfRequest request);
=======
public interface ProfService {
>>>>>>> 8c697f47cde7ed4da35e778026c20b72bcaa1972
}
