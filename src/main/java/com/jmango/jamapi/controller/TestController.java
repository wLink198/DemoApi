package com.jmango.jamapi.controller;

import com.jmango.jamapi.aspect.RestResponse;
import com.jmango.jamapi.model.res.ResponseNoData;
import com.jmango.jamapi.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@AllArgsConstructor
public class TestController {

    TestService testService;

    @GetMapping(value = "/demo-res", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @RestResponse
    public ResponseNoData index() {
        return new ResponseNoData(123, testService.demoResponse());
    }
}
