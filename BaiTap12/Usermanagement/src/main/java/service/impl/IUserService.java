package service.impl;

import model.User;

import java.util.List;

public interface IUserService {

    void deleteUserPro(int id);

    List<User> selectAllUsers();

    User getUserById(int id);

    List<User> sort(String sortOption);

    List<User> searchUser(String countrySearch);

    void updateUserPro(User book);

    void insertUserStore(User newUser);
}
