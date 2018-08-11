package com.examen.devops;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/devops")

        String home() {
            return "hello word";
        }
    }

