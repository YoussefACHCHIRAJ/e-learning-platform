package uca.ac.elearning.service.facade;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 728a08b8d7736ae2f92c53dc3130f1b8a610e60a
import org.springframework.web.bind.annotation.RequestBody;
import uca.ac.elearning.bean.common.Day;
import uca.ac.elearning.utils.ProfRequest;
import uca.ac.elearning.utils.ProfResponse;

import java.util.List;

public interface ProfService {
    List<Day> findAllDays();

    ProfResponse saveAvailability(@RequestBody ProfRequest request);
<<<<<<< HEAD

=======
=======
public interface ProfService {
>>>>>>> 8c697f47cde7ed4da35e778026c20b72bcaa1972
>>>>>>> 728a08b8d7736ae2f92c53dc3130f1b8a610e60a
}
