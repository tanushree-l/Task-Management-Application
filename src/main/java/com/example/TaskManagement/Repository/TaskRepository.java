package com.example.TaskManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TaskManagement.Model.TaskModel;

public interface TaskRepository extends JpaRepository<TaskModel,Long>{

}
