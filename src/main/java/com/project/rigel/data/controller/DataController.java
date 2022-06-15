package com.project.rigel.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.rigel.data.dto.ResponseDto;
import com.project.rigel.data.entity.DataEnt;
import com.project.rigel.data.service.DataService;


@RestController
@RequestMapping("/data")
public class DataController {

	@Autowired
	DataService dataService;
	
	  @GetMapping()
	  public ResponseEntity<ResponseDto<List<DataEnt>>> findAll() {
		  return new ResponseEntity<>(dataService.getAll(), HttpStatus.OK);
	  }
	  
	  @GetMapping("/{id}")
	  public ResponseEntity<ResponseDto<DataEnt>> getDataById(@PathVariable("id") Integer id) {
		  return new ResponseEntity<>(dataService.getDataById(id), HttpStatus.OK);
	  }

	  @PostMapping()
	  public ResponseEntity<ResponseDto<DataEnt>> insert(@RequestBody DataEnt usuarioEnt) {

		  return new ResponseEntity<>(dataService.save(usuarioEnt), HttpStatus.OK);
	  }
	  
	  @GetMapping("/byuser/{userid}")
	  public ResponseEntity<ResponseDto<List<DataEnt>>> findByUserId(@PathVariable("userid") Integer userid) {
		  
		  return new ResponseEntity<>(dataService.getUserById(userid), HttpStatus.OK);
	  }
}
























