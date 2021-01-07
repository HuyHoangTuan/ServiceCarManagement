package com.Tean.ServiceCarManagement.Schedule.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class ScheduleModel
{
    private int carid;
    private String departure;
    private String destination;
    private Timestamp startingtime;
    private Timestamp arrivingtime;
    private String capacity;
}
