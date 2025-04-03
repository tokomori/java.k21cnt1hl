package com.k21cnt1.lession11.example.controller;

import com.k21cnt1.lession11.example.service.NvtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/nvt")
public class NvtController {
    @Autowired
    private NvtService nvtService;
    @GetMapping
    public String getNvt(Model model){
        model.addAttribute("nvt", nvtService.getAllStudents());
        return "nvt-account-list";
    }
}
