package uca.ac.elearning.webService.ws;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uca.ac.elearning.bean.common.Day;
import uca.ac.elearning.service.facade.ProfService;
import uca.ac.elearning.utils.ProfRequest;
import uca.ac.elearning.utils.ProfResponse;

import java.util.List;

@RestController
@RequestMapping("/api/prof")
@RequiredArgsConstructor
public class ProfWs {

    private final ProfService profService;

    @PostMapping("/availability")
    public ResponseEntity<ProfResponse> saveAvailability(@RequestBody ProfRequest request) {
        return ResponseEntity.ok(profService.saveAvailability(request));
    }


    @GetMapping("/days")
    public List<Day> findAllDays() {
        return profService.findAllDays();
    }
}
