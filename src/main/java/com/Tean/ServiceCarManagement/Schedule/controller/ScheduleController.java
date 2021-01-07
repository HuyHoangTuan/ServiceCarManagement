package com.Tean.ServiceCarManagement.Schedule.controller;

import com.Tean.ServiceCarManagement.Schedule.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class ScheduleController
{
    @Autowired
    private ScheduleService scheduleService;

    @GetMapping("/schedule/get")
    public ResponseEntity<?> scheduleget(Principal principal)
    {
        return  ResponseEntity.ok().body(scheduleService.findAll());
    }
}
