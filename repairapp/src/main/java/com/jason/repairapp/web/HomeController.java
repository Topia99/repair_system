package com.jason.repairapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("today", LocalDate.now());
        model.addAttribute("orders", List.of(
//                new OrderSummary("王先生", "iPhone 14", "维修中", false),
//                new OrderSummary("Lisa", "iPhone 13 Pro", "等配件", true),
//                new OrderSummary("陈太太", "Galaxy S23", "待结账", false)
        ));
        return "home";
    }


}
