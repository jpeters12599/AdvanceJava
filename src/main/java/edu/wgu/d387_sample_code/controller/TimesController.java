package edu.wgu.d387_sample_code.controller;

import edu.wgu.d387_sample_code.Times;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TimesController {
    @GetMapping("/presentation")
    public ResponseEntity<String> timePresentation() {
        String times = "Come join us for a live presentation online held at the Landon Hotel at " + Times.getTime();
        return new ResponseEntity<String>(times, HttpStatus.OK);
    }
}
