package com.Tean.ServiceCarManagement.Schedule.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
public class Schedule
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name ="id")
    private int id;

    @Column(name = "carid")
    private int carid;

    @Column(name = "destination")
    private String destination;

    @Column(name = "departure")
    private String departure;

    @Column(name = "startingtime")
    private Timestamp startingtime;

    @Column(name = "arrivingtime")
    private Timestamp arrivingtime;

    @Column(name ="capacity")
    private String capacity;

}
