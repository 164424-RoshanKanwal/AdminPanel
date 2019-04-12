package com.cfs.adminpanel.services;

import com.cfs.adminpanel.models.AdminPanelAttributes;
import com.cfs.adminpanel.models.AdminPanelPreviewAttributes;

public interface AdminPanelService {

	String addSurvey(AdminPanelAttributes adminPanelAttributes);
	AdminPanelPreviewAttributes previewOfSurvey();
}
