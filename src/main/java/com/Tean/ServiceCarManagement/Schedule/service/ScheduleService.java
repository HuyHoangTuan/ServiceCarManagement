package com.Tean.ServiceCarManagement.Schedule.service;

import com.Tean.ServiceCarManagement.Schedule.entity.Schedule;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ScheduleService
{
    List<Schedule> findAll();
}
