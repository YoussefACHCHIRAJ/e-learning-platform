package uca.ac.elearning.webService.ws;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uca.ac.elearning.bean.common.Day;
import uca.ac.elearning.bean.prof.ProfAvailability;
import uca.ac.elearning.service.facade.ProfService;
import uca.ac.elearning.utils.ProfRequest;
import uca.ac.elearning.utils.ProfResponse;
import uca.ac.elearning.webService.converter.profConverter.ProfAvailabilityConverter;
import uca.ac.elearning.webService.dto.profDto.ProfAvailabilityDto;

import java.util.List;

@RestController
@RequestMapping("/api/prof")
@RequiredArgsConstructor
public class ProfWs {

    private final ProfService profService;
    private final ProfAvailabilityConverter profAvailabilityConverter;

    @PostMapping("/availability")
    public ResponseEntity<ProfResponse> saveAvailability(@RequestBody ProfRequest request) {
        return ResponseEntity.ok(profService.saveAvailability(request));
    }


    @GetMapping("/days")
    public List<Day> findAllDays() {
        return profService.findAllDays();
    }

    @GetMapping("/findAllProfAvailabilities/{email}")
    public List<ProfAvailabilityDto> findAllProfAvailabilities(@PathVariable("email") String profEmail) {
        List<ProfAvailability> allProfAvailabilities = profService.findAllProfAvailabilities(profEmail);
        return profAvailabilityConverter.toDto(allProfAvailabilities);
    }
}
