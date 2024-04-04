package uca.ac.elearning.webService.ws;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uca.ac.elearning.bean.path.PathStatus;
import uca.ac.elearning.service.facade.PathStatusService;
import uca.ac.elearning.webService.converter.pathConverter.PathStatusConverter;
import uca.ac.elearning.webService.dto.pathDto.PathStatusDto;

import java.util.List;

@RestController
@RequestMapping("/api/pathStatus")
@RequiredArgsConstructor
public class PathStatusWs {
    private final PathStatusService pathStatusService;
    private final PathStatusConverter pathStatusConverter;

    @GetMapping("/")
    public List<PathStatusDto> findAll() {
        List<PathStatus> pathStatuses = pathStatusService.findAll();
        return pathStatusConverter.toDto(pathStatuses);
    }
}
