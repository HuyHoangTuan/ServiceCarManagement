package com.Tean.ServiceCarManagement.carlist.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
public class carlist
{
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "driver")
    private String driver;

    @Column(name = "license")
    private String license;

    @Column(name = "brand")
    private String brand;

    @Column(name = "manufacturedate")
    private  int manufacturedate;

    @Column(name = "cartype")
    private String cartype;

    @Column(name = "registerdate")
    private Timestamp registerdate;

    @Column(name = "state")
    private String state;
}
