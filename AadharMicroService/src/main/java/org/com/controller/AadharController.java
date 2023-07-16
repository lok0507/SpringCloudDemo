package org.com.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/aadhar")
@RestController
public class AadharController {

    @RequestMapping("/{id}")
    public String getAadharId(@PathVariable("id") String id) {
        return id+" found successfully";
    }
}
