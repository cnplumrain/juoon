package root.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import root.entity.User;
@Repository
public interface UserMapper {
	public User selectUserById(@Param("userId") int userId);
	public User getUserByName(@Param("userName") String userName);
	public void insertUser(User user);
	public List<User> selectAllUser();
	public User selectUserByNameAndPass(@Param("userName")String userName, @Param("passWord")String passWord);
}

