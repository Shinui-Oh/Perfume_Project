package com.perfume.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignController {

    @GetMapping("signUp")
    public String SignUpPage() {

        return "members/signUp";
    }

    @GetMapping("signFind")
    public String SignFindPage() {

        return "members/signFind";
    }

    @GetMapping("finish")
    public String Finish() {

        return "loginPage";
    }

    @GetMapping("check")
    public String Check() {

        return "loginpage";
    }
}
