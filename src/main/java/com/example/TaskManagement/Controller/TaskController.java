package com.example.TaskManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TaskManagement.Model.Status;
import com.example.TaskManagement.Model.TaskModel;
import com.example.TaskManagement.Services.TaskServices;

@RestController
@RequestMapping("/task")
public class TaskController {
	@Autowired
	private TaskServices ser;
	
	@PostMapping("/create")
	public TaskModel CreateTask(@RequestBody TaskModel task) {
		return ser.saveTask(task);
	}
	
	@GetMapping("/view")
	public List<TaskModel>  ViewAll() {
		return ser.getAllTask();
	}
	
	@GetMapping("/view/{id}")
	public TaskModel ViewById(@PathVariable Long id) {
		return ser.getById(id);
	}
	
	@PutMapping("/update/{id}")
	public TaskModel Update(@PathVariable Long id,@RequestBody TaskModel Task) {
		return ser.updateById(id, Task);
	}
	
	@DeleteMapping("/delete/{id}")
	public void DeleteTask(@PathVariable Long id) {
		ser.DeleteByid(id);
	}
	
	@PutMapping("/status/{id}")
	public TaskModel StatusById(@PathVariable Long id,@RequestBody TaskModel Task) {
		return ser.statusById(id, Task);
	}
	
	@GetMapping("/status/{status}")
	public List<TaskModel> getTasksByStatus(@PathVariable Status status) {
	    return ser.findByStatus(status);
	}
}
