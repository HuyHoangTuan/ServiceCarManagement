package com.Tean.ServiceCarManagement.Schedule.model;

import java.sql.Timestamp;

public class ScheduleModel
{
    private int id;
    private int carid;
    private String departure;
    private String destination;
    private Timestamp startingtime;
    private Timestamp arrivingtime;
    private String capacity;
}
