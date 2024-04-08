package uca.ac.elearning.webService.ws;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uca.ac.elearning.service.facade.PathStatus;
import uca.ac.elearning.webService.converter.pathConverter.PathStatusConverter;
import uca.ac.elearning.webService.dto.pathDto.PathStatusDto;

import java.util.List;

@RestController
@RequestMapping("/api/pathStatus")
@RequiredArgsConstructor
public class PathStatusWs {
    private final PathStatus pathStatus;
    private final PathStatusConverter pathStatusConverter;

    @GetMapping("/")
    public List<PathStatusDto> findAll() {
        List<uca.ac.elearning.bean.path.PathStatus> pathStatuses = pathStatus.findAll();
        return pathStatusConverter.toDto(pathStatuses);
    }
}
