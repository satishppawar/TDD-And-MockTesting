package spring.mokito.demo.dao;

import spring.mokito.demo.model.Login;
import spring.mokito.demo.model.User;

public interface UserDao {
	void register(User user);

	User validateUser(Login login);
}