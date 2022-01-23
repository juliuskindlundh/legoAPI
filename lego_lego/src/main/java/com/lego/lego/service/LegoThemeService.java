package com.lego.lego.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.lego.lego.data.legoTheme.LegoThemeDTO;
import com.lego.lego.data.legoTheme.LegoThemeRepo;

@Service
public class LegoThemeService {
	LegoThemeRepo legoThemeRepo;
	@Autowired
	public LegoThemeService(LegoThemeRepo legoThemeRepo) {
		this.legoThemeRepo = legoThemeRepo;;
	}
	
	public ResponseEntity<?> getAll() {
		List<LegoThemeDTO> list = new ArrayList<LegoThemeDTO>();
		legoThemeRepo.findAll().forEach(theme->{
			list.add(theme.toDTO());			
		});
		return ResponseEntity.ok().body(list);
	}
	
	public ResponseEntity<?> search(String name){
		List<LegoThemeDTO> list = new ArrayList<LegoThemeDTO>();
		legoThemeRepo.search(name).forEach(theme->{
			list.add(theme.toDTO());			
		});
		System.out.println(list.size());
		return ResponseEntity.ok().body(list);
	}
}
