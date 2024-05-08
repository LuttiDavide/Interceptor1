package co.develhope.interceptor1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class BasicController {

    @GetMapping("/time")
    public String getCurrentTime() {
        return LocalDateTime.now().toString();
    }

}
