package com.example.altecsistemas.springboot_web.controllerss;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.altecsistemas.springboot_web.models.dtos.ParamDto;


@RestController
@RequestMapping("/api/params")
public class RequestParamsController {


    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false,defaultValue = "") String message) {
        ParamDto paramDto=new ParamDto();
        paramDto.setMessage(message);
        return paramDto;
    }
    

    @GetMapping("/bar")
    public ParamDto bar(@RequestParam String text,@RequestParam Integer code) {
        
        ParamDto paramDto=new ParamDto();
        paramDto.setMessage(text);
        paramDto.setCode(code);
        return paramDto;
    }
    
}
