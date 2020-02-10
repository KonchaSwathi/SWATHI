package cts.training.spring.webcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		// add business logic

		// must always return view name
		return "home-page";
	}
}


