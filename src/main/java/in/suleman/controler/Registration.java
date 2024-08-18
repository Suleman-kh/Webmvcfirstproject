package in.suleman.controler;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ch.qos.logback.core.model.Model;
import in.suleman.entity.MyEntity;
import in.suleman.repository.Myrepository;

@Controller
@Service
public class Registration {
	
	
	private Myrepository repo;
	public Registration(Myrepository repo) {
		super();
		this.repo = repo;
	}

	@GetMapping("/Register")
	public String page() {
		return "Register";
	}
	
	@PostMapping("/process")
	public String register(@ModelAttribute MyEntity user , Model model) {
		
		repo.save(user);
		
		return "Register";
		
	}

}
