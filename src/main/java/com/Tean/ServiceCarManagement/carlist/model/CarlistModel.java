package com.Tean.ServiceCarManagement.carlist.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.sql.Timestamp;

@Getter
@Setter
public class CarlistModel
{
    private String driver;
    private String license;
    private String brand;
    private int manufacturedate;
    private String cartype;
    private Timestamp registerdate;
    private String state;
}
