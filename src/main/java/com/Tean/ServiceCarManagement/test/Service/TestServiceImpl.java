package com.Tean.ServiceCarManagement.test.Service;

import com.Tean.ServiceCarManagement.test.Entity.Test;
import com.Tean.ServiceCarManagement.test.Model.TestModel;
import com.Tean.ServiceCarManagement.test.Repo.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService
{
    @Autowired
    private TestRepo testRepo;
    @Override
    public Test save(TestModel test)
    {
        Test t = new Test();
        t.setDitmehieucu(test.getDitmehieucu());
        testRepo.save(t);
        return t;
    }

    @Override
    public List<Test> findALl()
    {
        List<Test> list = testRepo.findAll();
        return list;
    }
}
