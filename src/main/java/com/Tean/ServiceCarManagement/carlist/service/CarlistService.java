package com.Tean.ServiceCarManagement.carlist.service;

import com.Tean.ServiceCarManagement.carlist.entity.carlist;
import com.Tean.ServiceCarManagement.carlist.entity.license;
import com.Tean.ServiceCarManagement.carlist.model.CarlistModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarlistService
{
    void save(CarlistModel model);
    List<carlist> findAll();
    void deleteById(int id);
    List<license> findByLicense(CarlistModel model);
    List<carlist> findById(int id);
}
