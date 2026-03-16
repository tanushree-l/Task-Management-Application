package com.example.TaskManagement.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TaskManagement.Model.Status;
import com.example.TaskManagement.Model.TaskModel;
import com.example.TaskManagement.Repository.TaskRepository;

@Service
public class TaskServices {
	@Autowired
	private TaskRepository repo;
	
	//save
	public TaskModel saveTask(TaskModel Task) {
		return repo.save(Task);
	}
	
	//getAll
	public List<TaskModel> getAllTask(){
		return repo.findAll();
	}
	
	//getbyID
	public TaskModel getById(Long id) {
		return repo.findById(id).orElse(null);
	}
	
	//updateTask
	public TaskModel updateById(Long id,TaskModel Task) {
		TaskModel existing=repo.findById(id).orElse(null);
		if(existing!=null) {
			existing.setTitle(Task.getTitle());
			existing.setDescription(Task.getDescription());
			existing.setStatus(Task.getStatus());
			return repo.save(existing);
		}
		return null;
	}
	//DeleteTask
	public void DeleteByid(Long id) {
		repo.deleteById(id);
	}
	
	//Update Status by id
	public TaskModel statusById(Long id,TaskModel task) {
		TaskModel existing=repo.findById(id).orElse(null);
		if(existing!=null) {
			existing.setStatus(task.getStatus());
			return repo.save(existing);
		}
		return null;
	}
	//find By status
	public List<TaskModel> findByStatus(Status status) {
		return repo.findByStatus(status);
	}
}
