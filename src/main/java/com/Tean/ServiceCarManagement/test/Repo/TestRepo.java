package com.Tean.ServiceCarManagement.test.Repo;

import com.Tean.ServiceCarManagement.test.Entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface TestRepo extends JpaRepository<Test, UUID>
{
    Test save(Test test);
    List<Test> findAll();

}
