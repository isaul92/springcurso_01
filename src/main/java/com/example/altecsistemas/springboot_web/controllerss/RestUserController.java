package com.example.altecsistemas.springboot_web.controllerss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.altecsistemas.springboot_web.models.User;
import com.example.altecsistemas.springboot_web.models.dtos.UserDto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;






@RestController
@RequestMapping("/api")
public class RestUserController {


@GetMapping("/details-dto")
public UserDto getDetailsDto() {
    UserDto userDto=new UserDto();
    User user=new User();
    user.setName("Isaul");
    user.setLastName("Mendieta");
    userDto.setUser(user);
    userDto.setTitle("DTO");
    return userDto;
}



    @GetMapping("/details-map")
    public Map<String,Object> getDetails() {

        User usuario=new User();
        usuario.setName("Isaul");
        usuario.setLastName("Mendieta");
     
        Map <String,Object> body=new HashMap<>();
        body.put("title", "Hola Mundo");
        body.put("user", usuario);
        

        return body;
    }

    
    
    @GetMapping("/details-list")
    public List<User> list(){
        User usuario=new User();

        usuario.setName("Isaul");
        usuario.setLastName("Mendieta");
        User usuario2=new User();
        usuario2.setName("Araceli");
        usuario2.setLastName("Ramirez");
        User usuario3=new User();
        usuario3.setName("Pablo");
        usuario3.setLastName("Mendieta");
   /*
        List<User> list=new ArrayList<>();
        list.add(usuario);
        list.add(usuario2);
        list.add(usuario3); */
        List<User> list=Arrays.asList(usuario,usuario2,usuario3);
     return list;
    }

}
