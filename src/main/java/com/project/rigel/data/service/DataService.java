package com.project.rigel.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.rigel.data.dto.ResponseDto;
import com.project.rigel.data.entity.DataEnt;
import com.project.rigel.data.repository.DataRepository;

import com.project.rigel.data.util.Util;


@Service
public class DataService {
	
	@Autowired
	DataRepository dataRepository;
	
	@Autowired
	private Util util;
	  
	public ResponseDto<List<DataEnt>> getAll(){
		return util.setDataResponse(dataRepository.findAll(), null, null);
		 
	}
	
	public ResponseDto<DataEnt> getDataById(Integer id) {
		DataEnt data = dataRepository.findById(id).orElse(null);
		return util.setDataResponse(data , null, null);
	}
	
	public ResponseDto<DataEnt> save(DataEnt dataParam) { 
		DataEnt nuevo = dataRepository.save(dataParam);
		return util.setDataResponse(nuevo, null, null);
		
	}
	
	public ResponseDto<List<DataEnt>> getUserById(Integer id) {
		List<DataEnt> data = dataRepository.findByUsuario(id);
		return util.setDataResponse(data , null, null);
	}
	
	
}
