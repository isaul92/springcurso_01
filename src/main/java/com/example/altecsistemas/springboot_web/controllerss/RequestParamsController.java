package com.example.altecsistemas.springboot_web.controllerss;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.altecsistemas.springboot_web.models.dtos.ParamDto;
import com.example.altecsistemas.springboot_web.models.dtos.ParamMixDto;


import jakarta.servlet.http.HttpServletRequest;


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
    public ParamMixDto bar(@RequestParam String text,@RequestParam Integer code) {
        
        ParamMixDto paramDto=new ParamMixDto();
        paramDto.setMessage(text);
        paramDto.setCode(code);
        return paramDto;
    }
    
    @GetMapping("/request")
    public ParamMixDto request(HttpServletRequest request) {
        ParamMixDto paramMixDto=new ParamMixDto();
        paramMixDto.setCode(Integer.parseInt(request.getParameter("code")));
        paramMixDto.setMessage(request.getParameter("message"));
        return paramMixDto;
    }
    
}
