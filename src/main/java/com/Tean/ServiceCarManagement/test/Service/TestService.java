package com.Tean.ServiceCarManagement.test.Service;

import com.Tean.ServiceCarManagement.test.Entity.Test;
import com.Tean.ServiceCarManagement.test.Model.TestModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TestService
{
    Test save(TestModel test);
    List<Test> findALl();
}
