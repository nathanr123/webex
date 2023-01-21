package com.kkrd.webex;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kamalanathan Ranganathan
 */
@RestController
@RequestMapping("api/events")
public class WebExController {

    @GetMapping("/getmyname")
    public String getName(){
        return "Kamalanathan";
    }
}