package task01.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import task01.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
	public User findByUserName(String username);
	
}