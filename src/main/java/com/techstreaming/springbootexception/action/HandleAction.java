package com.techstreaming.springbootexception.action;

import com.techstreaming.springbootexception.exception.AppException;
import com.techstreaming.springbootexception.exception.ErrorCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HandleAction {


    @GetMapping(value = "/hello/{name}")
    public String sayHelloTo(@PathVariable String name) throws AppException {

        if (name.equals("null")) {
            throw new AppException(ErrorCode.NOT_FOUND, "Student Not Found with Name = " + name);
        }

        return "Hello Exception Handle Name=" + name;
    }
}
