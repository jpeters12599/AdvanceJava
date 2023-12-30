package edu.wgu.d387_sample_code.controller;

import edu.wgu.d387_sample_code.Welcome;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class WelcomeController {
    @GetMapping("/welcome")
    public ResponseEntity<String> showWelcome (@RequestParam("lang") String lang) {
        Locale locale = Locale.forLanguageTag(lang);
        Welcome message = new Welcome(locale);
        return new ResponseEntity<String> (message.getWelcome(), HttpStatus.OK);
    }
}
