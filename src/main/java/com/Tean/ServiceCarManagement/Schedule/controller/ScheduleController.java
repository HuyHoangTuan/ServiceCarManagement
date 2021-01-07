package com.Tean.ServiceCarManagement.Schedule.controller;

import com.Tean.ServiceCarManagement.Schedule.entity.Schedule;
import com.Tean.ServiceCarManagement.Schedule.model.AuthModel;
import com.Tean.ServiceCarManagement.Schedule.model.ScheduleEraserModel;
import com.Tean.ServiceCarManagement.Schedule.model.ScheduleModel;
import com.Tean.ServiceCarManagement.Schedule.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

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
    public ResponseEntity<?> scheduleadd(Principal principal, @RequestBody ScheduleModel model)
    {
        AuthModel res = new AuthModel();
        if(model.getStartingtime().after(model.getArrivingtime()) == true)
        {
            res.setState(1);
            res.setMessage("Invalid time set");
            return ResponseEntity.ok().body(res);
        }
        List<Schedule> list = scheduleService.findByCarid(model.getCarid());
        for(Schedule schedule : list)
        {
            if  (   (   model.getStartingtime().after(schedule.getStartingtime()) &&
                        model.getStartingtime().before(schedule.getArrivingtime())
                    )
                    ||
                    (
                            model.getArrivingtime().after(schedule.getStartingtime()) &&
                            model.getArrivingtime().before(schedule.getArrivingtime())
                    )
                )
            {
                res.setState(1);
                res.setMessage("Invalid time set");
                return ResponseEntity.ok().body(res);
            }
        }
        res.setState(0);
        scheduleService.save(model);
        return ResponseEntity.ok().body(res);
    }
}
