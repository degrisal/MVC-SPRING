package ru.tsydilin.springc;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(HttpServletRequest request) {
        String name = request.getParameter("name");
        String surnamename = request.getParameter("surnamename");
        System.out.println("Hello," + name +"" +surnamename);
        return "first/hello";  // Имя шаблона без .html
    }
    @GetMapping("/goodbye")
    public String goodByePage() {return "first/goodbye";}
}
