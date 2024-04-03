package uca.ac.elearning.service.facade;
import org.springframework.web.bind.annotation.RequestBody;
import uca.ac.elearning.bean.common.Day;
import uca.ac.elearning.bean.prof.ProfAvailability;
import uca.ac.elearning.utils.ProfRequest;
import uca.ac.elearning.utils.ProfResponse;

import java.util.List;

public interface ProfService {
    List<Day> findAllDays();

    ProfResponse saveAvailability(@RequestBody ProfRequest request);

    List<ProfAvailability> findAllProfAvailabilities(String profEmail);
}
