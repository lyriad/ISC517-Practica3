package com.isc517.practica3.isc517practica3.Controllers;

import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import com.isc517.practica3.isc517practica3.Models.User;
import com.isc517.practica3.isc517practica3.Services.UserService;
import com.isc517.practica3.isc517practica3.Models.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login(Model model) {

        return "/auth_login";
    }

    @PostMapping("/login")
    public String logUser(@RequestParam("username") String username, @RequestParam("password") String password, HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("logged_user");
        if(user == null){
            user = userService.getUsuarioByUsernameAndPassword(username, password);
            if(user != null){
                request.getSession().setAttribute("logged_user", user);
            }
            else{
                return "redirect:/login";
            }
        }

        return "redirect:/form";
    }
}
