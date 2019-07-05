package org.bestfeng.template.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bsetfeng
 * @since 1.0
 **/
@RestController
@RequestMapping("/user")
public class LoginController {

    @GetMapping("login")
    public String login(){
        return "successfully";
    }

}
