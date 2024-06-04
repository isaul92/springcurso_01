
package com.example.altecsistemas.springboot_web.controllerss;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.altecsistemas.springboot_web.models.User;
import com.example.altecsistemas.springboot_web.models.dtos.ParamMixDto;

import lombok.val;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @Autowired
    private Environment enviroment;

    @Value("#{${config.valuesMap}}")
    private Map<String, Object> productConfig;

    @Value("#{${config.valuesMap}.product}")
    private String product;

    @Value("#{${config.valuesMap}.price}")
    private String price;

    @Value("${config.username}")
    private String username;

    @Value("${config.message}")
    private String message;

    @Value("${config.listOfValues}")
    private String[] listOfValues;

    @Value("${config.code}")
    private Integer code;

    @GetMapping("/baz/{message}/{code}")
    public ParamMixDto baz(@PathVariable String message, @PathVariable Integer code) {
        ParamMixDto paramDto = new ParamMixDto();
        paramDto.setMessage(message);
        paramDto.setCode(code);
        return paramDto;
    }

    @GetMapping("/mix/{product}/{id}")
    public Map<String, Object> mixPathVar(@PathVariable String product, @PathVariable Integer id) {
        Map<String, Object> json = new HashMap<>();
        json.put("product", product);
        json.put("id", id);
        return json;
    }

    @PostMapping("/user")
    public User postMethodName(@RequestBody User user) {
        // TODO: process POST request

        return user;
    }

    @GetMapping("values")
    public Map<String, Object> values() {
        Map<String, Object> values = new HashMap<>();
        values.put("message", message);
        values.put("message2", enviroment.getProperty("config.message"));
        values.put("username", username);
        values.put("listOfValues", listOfValues);
        values.put("code", code);
        values.put("product", productConfig);
        values.put("productName", product);
        values.put("price", price);
        ArrayList values2 = new ArrayList<String>();

values2.add("values2");
System.out.println(values2);
        return values;

    }

}
