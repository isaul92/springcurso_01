package com.example.altecsistemas.springboot_web.controllerss;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.altecsistemas.springboot_web.models.User;



@Controller
public class UserController {


    @GetMapping("/details")
    public String getDetails(Model model) {
        User usuario=new User();
        usuario.setName("Pablo");
        usuario.setLastName("Mendieta");
        model.addAttribute("title", "Hola mundo");
        model.addAttribute("userName", "Isaul");
        model.addAttribute("lastName", "Mendieta");
        model.addAttribute("usuario", usuario);
        
        return "details";
    }

}
