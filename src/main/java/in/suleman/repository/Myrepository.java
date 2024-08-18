package in.suleman.repository;

import org.springframework.data.repository.CrudRepository;
import in.suleman.entity.MyEntity;

public interface Myrepository extends CrudRepository<MyEntity ,Integer> {

}
