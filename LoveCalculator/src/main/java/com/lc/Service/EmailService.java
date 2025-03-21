package com.lc.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender javaMailSender;

	public void emailSend(String yourName, String crushName, String email, String result) {
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(email);
		mail.setSubject("Love Calculator Result");
	
	String emoji;
		switch (result) {
		case "Friend": {
			 emoji = "🤝";
			break;
		}

		case "LifePartner": {
			emoji = "❤️";
			break;
		}

		default: {
			 emoji = "😈";
			break;
		}

		}

		mail.setText("Hi " + yourName + "! your relation with " + crushName + " is " + result+ " "+emoji);

		javaMailSender.send(mail);

	}

}
