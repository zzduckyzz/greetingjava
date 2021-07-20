package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class APIController {

    @RequestMapping(method = RequestMethod.GET, value = "/api/simplifyingtech")
    public String getRequest() {
        return "Swagger Hello World from Spring...";
    }

    @PostMapping("/api/posts")
    public String postRequest(@RequestBody String yourName) {
        return "Hello " + yourName;
    }
}
