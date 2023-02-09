package com.brandon.daikichi;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// 2. Importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
// 1. Annotation
@RestController
@RequestMapping("/daikichi")
public class Daikichi {
        // 1. Annotation
        // 3. Method that maps to the request route above
        @RequestMapping("")
        public String welcome() { // 3
                return "Welcome";
        }

        @RequestMapping("/today")
        public String today() { // 3
                return "today you will find luck in all your endeavors!";
        }

        @RequestMapping("/tomorrow")
        public String tomorrow() { // 3
                return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
        }
}
