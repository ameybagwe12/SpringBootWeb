package com.amey.SpringBootWeb;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

// SPRING WEB APP USING MODEL VIEW CONTROLLER (MVC)
@Controller
// WHEN YOU CALL HOME METHOD THE INDEX.JSP SHOULD BE RETURNED
public class HomeController {

    // SEPERATE METHOD TO RETURN COURSE NAME
    @ModelAttribute("course")
    public String courseName() {
        return "JAVA";
    }

    // THE ROUTE TO DISPLAY THE INDEX.JSP USING REQUEST MAPPING
    @RequestMapping("/")
    public String home() {
        System.out.println("Home method called");
        return "index";
    }

    // ALTERNATE METHOD - public String add(HttpServletRequest req, HttpSession session) {
    @RequestMapping("add")
    // GETTING REQUEST PARAMETERS OF ADD PAGE FROM THE FORM SUBMITTED VIA HOME
    public ModelAndView add(@RequestParam("num1") int num1, int num2, /*Model*/ ModelAndView mv) {
        // int num1 = Integer.parseInt(req.getParameter("num1"));
        // int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = num1 + num2;
        System.out.println(result);

        // NAME AND DATA SHOULD BE PASSED TO SESSION
        // HttpSession session - 3rd argument instead of model (OTHER ALTERNATIVE)
        // session.setAttribute("result", result);

        // MVC - MODEL(TO TRANSFER DATA)
        // model.addAttribute("result", result);
        mv.addObject("result", result);
        mv.setViewName("add");
        return mv;
        // return "add";
    }

    @RequestMapping("/addAlien")
    // ASSIGNING VALUE TO DIRECTLY TO ALIEN OBJECT
    // MODEL ATTR IS OPTIONAL TO SET DIFFERENT NAME
    public String add(@ModelAttribute("alien1") Alien alien) {
        // CREATING AND SENDING OBJECT TO PAGE
        // Alien alien = new Alien();
        // alien.setAid(aid);
        // alien.setAname(aname) ;
        // mv.addObject("alien", alien);
        // mv.setViewName("add");
        // return mv;
         return "add";
    }
}
