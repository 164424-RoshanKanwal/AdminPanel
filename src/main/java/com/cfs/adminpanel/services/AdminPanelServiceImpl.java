package com.cfs.adminpanel.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cfs.adminpanel.models.AdminPanelAttributes;
import com.cfs.adminpanel.models.AdminPanelPreviewAttributes;

@Service
public class AdminPanelServiceImpl implements AdminPanelService {

	@Autowired
	RestTemplate restTemplate;
	
	private final String baseURL = "http://localhost:3232/survey/";
	@Override
	public String addSurvey(AdminPanelAttributes adminPanelAttributes) {
		
		return restTemplate.postForObject(baseURL, adminPanelAttributes, String.class);
		
	}
	
	@Override
	public AdminPanelPreviewAttributes previewOfSurvey() {
		// TODO Auto-generated method stub
		return null;
	}

}
