package com.cfs.adminpanel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cfs.adminpanel.models.AdminPanelAttributes;
import com.cfs.adminpanel.services.AdminPanelService;

@RestController
public class AdminPanelController {

	@Autowired
	private AdminPanelService adminPanelService;
	
	@RequestMapping("/add-survey")
	public void addSurvey(@RequestBody AdminPanelAttributes adminPanelAttributes) {
		System.out.println("This enables adding surveys");
		adminPanelService.addSurvey(adminPanelAttributes);
		
	}
	
	
	
	
	
}
