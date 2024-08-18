package in.suleman.controler;
import java.util.List;

import org.springframework.stereotype.Service;

import in.suleman.entity.MyEntity;
import in.suleman.repository.Myrepository;
@Service
public class FindData {
	private Myrepository repo;

	public FindData(Myrepository repo) {
		super();
		this.repo = repo;
	}
	
	public List<MyEntity> getData(){
		
		return (List<MyEntity>) repo.findAll();
		
	}


}
