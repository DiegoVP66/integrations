package com.dvpdev.integrations.services;

import com.dvpdev.integrations.dto.EmailDTO;

public interface EmailService {
	
	void sendEmail(EmailDTO dto);

}
