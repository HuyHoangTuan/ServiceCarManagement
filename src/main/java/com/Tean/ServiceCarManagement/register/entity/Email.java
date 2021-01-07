package com.Tean.ServiceCarManagement.register.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Email
{
    @Id
    @Column(name = "email")
    private String email;
}
