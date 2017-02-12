package tech.kevinfarley;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KfController {
	@RequestMapping("/")
	public String index(){
		return "index";
	}
}
