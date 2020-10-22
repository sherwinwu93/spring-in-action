package com.wusd.security.controller;

import com.wusd.security.model.User;
import com.wusd.security.model.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    JdbcOperations jdbcOperations;
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "test";
    }
    @RequestMapping(value = "/datasource", method = RequestMethod.GET)
    @ResponseBody
    public String wusd() {
        User user = jdbcOperations.queryForObject("select * from user where username='wusd' limit 1", new UserRowMapper());
        return user.getUsername();
    }

    @RequestMapping(value = "/jsr", method = RequestMethod.GET)
    @ResponseBody
    public String jsr(@Valid User user, Errors errors) {
        if (errors.hasErrors()) {
            List<ObjectError> allErrors = errors.getAllErrors();
            System.out.println("===============================");
            allErrors.forEach(error -> {
                System.out.println(error);
            });
            System.out.println("===============================");
        }
        return "wusd";
    }

    @RequestMapping(value = "/roleUser", method = RequestMethod.GET)
    @ResponseBody
    public String roleUser() {
        return "roleUser";
    }

    @RequestMapping(value = "/roleAdmin", method = RequestMethod.GET)
    @ResponseBody
    public String roleAdmin() {
        return "roleAdmin";
    }
}
