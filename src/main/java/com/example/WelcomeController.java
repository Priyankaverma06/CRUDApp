package com.example;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class WelcomeController {

    private String msg;
    public WelcomeController(@Value("${WELCOME_MESSAGE}") String msg)
        {
            this.msg = msg;
        }

    @GetMapping("/")
    public String sayHello(){
        return msg;
    }
    
    @RequestMapping("/welcome.html")
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}
}
