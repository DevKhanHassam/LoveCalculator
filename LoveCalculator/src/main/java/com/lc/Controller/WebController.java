package com.lc.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lc.Dto.UserData;
import com.lc.Dto.Handler.MytextHandler;
import com.lc.Service.EmailService;
import com.lc.Service.LoveService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
@SessionAttributes("userDataObj")
public class WebController {

	
	@Autowired
	EmailService emailService;
	
	@Autowired
	LoveService loveService;
	

	
	
	@RequestMapping("/")
	public String homePage(UserData userData, HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		String userName  = (String) session.getAttribute("userName"); 
		String crushName = (String) session.getAttribute("crushName"); 
		String userEmail  = (String) session.getAttribute("userEmail"); 
		Integer userAge= (Integer) session.getAttribute("userAge"); 
		
		
		userData.setUserName(userName);
		userData.setCrushName(crushName);
		userData.setEmailAddress(userEmail);
		userData.setUserAge(userAge);
		
	
		return "home";
	}
	
	
	@RequestMapping("/userDetails")
	public String userDetails(@Valid UserData userDataObj, BindingResult result, HttpServletRequest request, Model model)
	{
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(120);
		session.setAttribute("userName", userDataObj.getUserName());
		session.setAttribute("crushName", userDataObj.getCrushName());
		session.setAttribute("userEmail", userDataObj.getEmailAddress());
		session.setAttribute("userAge", userDataObj.getUserAge());
		
		String loveResult=loveService.result();
		session.setAttribute("loveResult",loveResult);
		
		if(result.hasErrors())
		{
			List<ObjectError> allErrors = result.getAllErrors();
			for(ObjectError temp: allErrors)
			{
				System.out.println(temp);
			}
			
			return "home";
		}
	
		return "userDetails";
	}
	
	
	@RequestMapping("/result")
	public String showResult(HttpServletRequest request, Model model)
	{
		
		
//		HttpSession session = request.getSession();
//		
//		String result= (String) session.getAttribute("loveResult");
//		String userName= (String) session.getAttribute("userName");
//		String crushName= (String) session.getAttribute("crushName");
//		String email= (String) session.getAttribute("userEmail");
		
		
		return "result";
	}
	
	
	@RequestMapping("/sendResult")
	public String sendResult(HttpServletRequest request)

	{
		
       HttpSession session = request.getSession();
		
		String result= (String) session.getAttribute("loveResult");
		String userName= (String) session.getAttribute("userName");
		String crushName= (String) session.getAttribute("crushName");
		String email= (String) session.getAttribute("userEmail");
		emailService.emailSend(userName,crushName, email, result);
		
		
		
		return "sendResult";
	}
	
	
	@InitBinder
    public void initBinder(WebDataBinder binder) {
		
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		
		
		binder.registerCustomEditor(String.class, "userName", editor);
		
        binder.registerCustomEditor(String.class, "userName", new MytextHandler());
        binder.registerCustomEditor(String.class, "crushName", new MytextHandler());
    }

	
	
}

