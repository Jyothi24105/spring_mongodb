package com.info.reposiotry;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.info.model.Customer;

/**
 * @author jyothi
 *
 */

public interface CustomerRepository extends MongoRepository<Customer,String>{

	 public Customer findByFirstName(String firstName);
	    public List<Customer> findByLastName(String lastName);
	
}
