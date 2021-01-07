package com.Tean.ServiceCarManagement.Schedule.controller;

import com.Tean.ServiceCarManagement.Schedule.model.ScheduleEraserModel;
import com.Tean.ServiceCarManagement.Schedule.model.ScheduleModel;
import com.Tean.ServiceCarManagement.Schedule.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
public class ScheduleController
{
    @Autowired
    private ScheduleService scheduleService;

    @GetMapping("/schedule/get")
    public ResponseEntity<?> scheduleget(Principal principal)
    {
        return  ResponseEntity.ok().body(scheduleService.findAll());
    }

    @DeleteMapping("/schedule/delete")
    public ResponseEntity<?> scheduledelete(Principal principal, @RequestBody ScheduleEraserModel model)
    {
        scheduleService.deleteById(model.getIdlist());
        return ResponseEntity.ok().body(scheduleService.findAll());
    }

    @PostMapping("/schedule/add")
    public void scheduleadd(Principal principal, @RequestBody ScheduleModel model)
    {
        scheduleService.save(model);
    }
}
