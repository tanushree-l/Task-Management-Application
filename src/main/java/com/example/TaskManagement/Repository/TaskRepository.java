package com.example.TaskManagement.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TaskManagement.Model.Status;
import com.example.TaskManagement.Model.TaskModel;

public interface TaskRepository extends JpaRepository<TaskModel,Long>{
	List<TaskModel> findByStatus(Status status);
}
