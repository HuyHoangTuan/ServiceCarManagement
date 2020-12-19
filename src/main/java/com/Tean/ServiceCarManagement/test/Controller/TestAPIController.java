package com.Tean.ServiceCarManagement.test.Controller;

import com.Tean.ServiceCarManagement.test.Model.TestModel;
import com.Tean.ServiceCarManagement.test.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAPIController
{
    @Autowired
    private TestService testService;

    @PostMapping("/upload")
    private ResponseEntity<?> upload(@RequestBody TestModel model)
    {
        testService.save(model);
        return ResponseEntity.ok().body(null);
    }
    @GetMapping("/get")
    private ResponseEntity<?> get()
    {
        return ResponseEntity.ok().body(testService.findALl());
    }


}
