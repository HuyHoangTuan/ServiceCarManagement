package com.Tean.ServiceCarManagement.Schedule.service;

import com.Tean.ServiceCarManagement.Schedule.entity.Schedule;
import com.Tean.ServiceCarManagement.Schedule.model.ScheduleModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ScheduleService
{
    List<Schedule> findAll();
    void deleteById(List<Integer> list);
    void save(ScheduleModel model);
    List<Schedule> findByCarid(int carid);
}
