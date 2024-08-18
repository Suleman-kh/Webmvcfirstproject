package in.suleman.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.suleman.entity.MyEntity;

@Controller
public class ShowEmpData {
	
	@Autowired
	private FindData fd;
	
	@GetMapping("/show")
	public String listEmp(Model model) {
		
		List<MyEntity> user = (List<MyEntity>) fd.getData();
		
		model.addAttribute("users" , user);
		return "index";
		
	}

}
