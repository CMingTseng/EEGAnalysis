package com.hisaki.www.eeg_analysis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
        import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class EegAnalysisApplication {

    public static void main(String[] args) {
        SpringApplication.run(EegAnalysisApplication.class, args);
    }

//    @GetMapping("/")
//    @ResponseBody
//    public String root() {
//        return "hello world!!";
//    }
}
