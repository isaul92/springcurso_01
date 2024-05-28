package com.example.altecsistemas.springboot_web.controllerss;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.altecsistemas.springboot_web.models.User;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {

    @GetMapping("/details")
    public String getDetails(Model model) {
        User usuario = new User();
        usuario.setName("Pablo");
        usuario.setLastName("Mendieta");
        model.addAttribute("title", "Hola mundo");
        model.addAttribute("userName", "Isaul");
        model.addAttribute("lastName", "Mendieta");
        model.addAttribute("usuario", usuario);

        return "details";
    }


    @GetMapping("/details-list")
    public String getDetailsList(ModelMap model) {
      
        //model.addAttribute("users",users);
        model.addAttribute("title","Listado de usuarios!");
        return "list";
    }

    @ModelAttribute("users")
    public List<User> usersModel(){
        User usuario=new User();
        usuario.setName("Isaul");
        usuario.setLastName("Mendieta");
        User usuario2=new User();
        usuario2.setName("Araceli");
        usuario2.setLastName("Ramirez");
        User usuario3=new User();
        usuario3.setName("Pablo");
        usuario3.setLastName("Mendieta");
        List<User> users=Arrays.asList(usuario,usuario2,usuario3);
        return users;
    }
        

}
