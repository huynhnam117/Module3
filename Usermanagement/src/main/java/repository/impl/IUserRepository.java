package repository.impl;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {
    public void insertUser(User user) throws SQLException;

    public User selectUser(int id);

    public List<User> selectAllUsers();

    public boolean deleteUser(int id) throws SQLException;

    public boolean updateUser(User user) throws SQLException;

    public List<User> searchUser(String country) throws SQLException;

    public List<User> sort(String sortOption) throws SQLException;

    User getUserById(int id);

    void insertUserStore(User user) throws SQLException;

    public List<User> selectAllUsersPro();

    public void updateUserPro(User user) throws SQLException;

    public void deleteUserPro(int id);

}
