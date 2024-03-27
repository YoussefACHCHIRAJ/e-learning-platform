package uca.ac.elearning.webService.ws;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
@RequiredArgsConstructor
public class Demo {

    @GetMapping("/")
    public String demo(){
        return "Hello Demo";
    }
}
