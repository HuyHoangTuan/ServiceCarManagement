package com.Tean.ServiceCarManagement.Schedule.service;

import com.Tean.ServiceCarManagement.Schedule.entity.Schedule;
import com.Tean.ServiceCarManagement.Schedule.repo.ScheduleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService
{
    @Autowired
    private ScheduleRepo scheduleRepo;

    @Override
    public List<Schedule> findAll()
    {
        return scheduleRepo.findAll();
    }
}
