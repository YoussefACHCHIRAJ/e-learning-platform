package uca.ac.elearning.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import uca.ac.elearning.bean.common.Day;
import uca.ac.elearning.bean.prof.ProfAvailability;
import uca.ac.elearning.bean.prof.ProfAvailabilityDetail;
import uca.ac.elearning.bean.users.User;
import uca.ac.elearning.dao.commonDao.DayDao;
import uca.ac.elearning.dao.prof.ProfAvailabilityDao;
import uca.ac.elearning.dao.prof.ProfAvailabilityDetailsDao;
import uca.ac.elearning.dao.users.UserDao;
import uca.ac.elearning.service.facade.ProfService;
import uca.ac.elearning.utils.ProfRequest;
import uca.ac.elearning.utils.ProfResponse;

import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfServiceImpl implements ProfService {

    private final DayDao dayDao;
    private final UserDao userDao;
    private final ProfAvailabilityDao profAvailabilityDao;
    private final ProfAvailabilityDetailsDao profAvailabilityDetailsDao;

    @Override
    public List<Day> findAllDays(){
        return dayDao.findAll();
    }

    @Override
    public ProfResponse saveAvailability(@RequestBody ProfRequest request){
        String profEmail = request.getProfEmail();
        User prof =  userDao.findByEmail(profEmail).orElseThrow();
        var profAvailabilities = request.getProfAvailabilitiesDetails();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm");
        profAvailabilities.forEach(detail -> {

            var profAvailability = ProfAvailability.builder()
                    .prof(prof)
                    .day(dayDao.findByCode(detail.getDayCode()))
                    .build();
            var profAvailabilityDetails = ProfAvailabilityDetail.builder()
                    .profAvailability(profAvailability)
                    .startTimeSlot(detail.getStartTimeSlot())
                    .endTimeSlot(detail.getEndTimeSlot())
                    .build();
            profAvailabilityDao.save(profAvailability);
            profAvailabilityDetailsDao.save(profAvailabilityDetails);
        });
        return ProfResponse.builder()
                .StatusCode(201)
                .message("ok")
                .build();
    }
}
