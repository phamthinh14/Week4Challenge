package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage() {
        //Tra ve cai HTML name file thi no se bat cai HTML file do cho minh
        return "Home";
    }

    @RequestMapping("/entry1")
    public String entry1Page() {
        //Tra ve cai HTML name file thi no se bat cai HTML file do cho minh
        return "Entry1";
    }

    @RequestMapping("/entry2")
    public String entry2Page() {
        //Tra ve cai HTML name file thi no se bat cai HTML file do cho minh
        return "Entry2";
    }

    @RequestMapping("/entry3")
    public String entry3Page() {
        //Tra ve cai HTML name file thi no se bat cai HTML file do cho minh
        return "Entry3";
    }

    @RequestMapping("/entry4")
    public String entry4Page() {
        //Tra ve cai HTML name file thi no se bat cai HTML file do cho minh
        return "Entry4";
    }

    @RequestMapping("/entry5")
    public String entry5Page() {
        //Tra ve cai HTML name file thi no se bat cai HTML file do cho minh
        return "Entry5";
    }

    @RequestMapping("/entry6")
    public String entry6Page() {
        //Tra ve cai HTML name file thi no se bat cai HTML file do cho minh
        return "Entry6";
    }

    @RequestMapping("/entry7")
    public String entry7Page() {
        //Tra ve cai HTML name file thi no se bat cai HTML file do cho minh
        return "Entry7";
    }

    @RequestMapping("/entry8")
    public String entry8Page() {
        //Tra ve cai HTML name file thi no se bat cai HTML file do cho minh
        return "Entry8";
    }

    @RequestMapping("/entry9")
    public String entry9Page() {
        //Tra ve cai HTML name file thi no se bat cai HTML file do cho minh
        return "Entry9";
    }

    @RequestMapping("/entry10")
    public String entry10Page() {
        //Tra ve cai HTML name file thi no se bat cai HTML file do cho minh
        return "Entry10";
    }

    @RequestMapping("/profile")
    public String profilePage() {
        //Tra ve cai HTML name file thi no se bat cai HTML file do cho minh
        return "Profile";
    }

    @RequestMapping("/about")
    public String aboutPage() {
        //Tra ve cai HTML name file thi no se bat cai HTML file do cho minh
        return "About";
    }
}
