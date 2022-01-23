package com.lego.lego.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lego.lego.service.LegoThemeService;

@RestController
public class LegoThemeController {
	
	LegoThemeService legoThemeService;
	@Autowired
	public LegoThemeController(LegoThemeService legoThemeService) {
		this.legoThemeService = legoThemeService;
		}
	
	@GetMapping("/{name}")
	public ResponseEntity<?> search(@PathVariable("name")String name) {
		return legoThemeService.search(name);
		
	}
}
