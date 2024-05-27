package com.example.altecsistemas.springboot_web.controllerss;

import java.util.HashMap;
import java.util.Map;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.altecsistemas.springboot_web.models.User;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/api")
public class RestUserController {


    @GetMapping("/details")
    public Map<String,Object> getDetails() {

        User usuario=new User();
        usuario.setName("Isaul");
        usuario.setLastName("Mendieta");
     
        Map <String,Object> body=new HashMap<>();
        body.put("title", "Hola Mundo");
        body.put("user", usuario);
        

        return body;
    }

}
