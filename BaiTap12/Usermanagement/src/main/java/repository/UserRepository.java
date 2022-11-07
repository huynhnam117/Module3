package repository;

import model.User;
import repository.impl.IUserRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository {
    private static final String INSERT_USERS_SQL = "INSERT INTO users (name, email, country) VALUES (?, ?, ?);";
    private static final String SELECT_USER_BY_ID = "select id,name,email,country from users where id =?";
    private static final String SELECT_ALL_USERS = "select * from users";
    private static final String DELETE_USERS_SQL = "delete from users where id = ?;";
    private static final String UPDATE_USERS_SQL = "update users set name = ?,email= ?, country =? where id = ?;";


    public UserRepository() {

    }
    @Override
    public void insertUser(User user) throws SQLException {
        System.out.println(INSERT_USERS_SQL);
        Connection connection = BaseRepository.getConnectDB();
        try (PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getCountry());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    private void printSQLException(SQLException e) {

    }

    @Override
    public User selectUser(int id) {
        User user = null;
        Connection connection = BaseRepository.getConnectDB();
        try (
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                user = new User(id, name, email, country);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return user;
    }


    @Override
    public List<User> selectAllUsers() {
        List<User> users = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try (
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                users.add(new User(id, name, email, country));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return users;

    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        boolean rowDeleted;
        Connection connection = BaseRepository.getConnectDB();
        try (
                PreparedStatement statement = connection.prepareStatement(DELETE_USERS_SQL)
        ) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }


    @Override
    public boolean updateUser(User user) throws SQLException {
        boolean rowUpdated;
        Connection connection = BaseRepository.getConnectDB();
        try (
                PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);) {
            statement.setString(1, user.getName());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getCountry());
            statement.setInt(4, user.getId());

            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }



    @Override
    public List<User> searchUser(String country) throws SQLException {
        List<User> users = selectAllUsers();
        List<User> usersFounded = new ArrayList<>();

        for (User x : users) {
            if (x.getCountry().equals(country)) {
                usersFounded.add(x);
            }
        }

        return usersFounded;
    }

    @Override
    public List<User> sort(String sortOption) throws SQLException {
//        List<User> users = selectAllUsers();
//        Collections.sort(users);
//        return users;
        return null;
    }

    @Override
    public User getUserById(int id) {
        User user = null;
        String queryById = "{CALL get_user_by_id(?)}";
        Connection conn = BaseRepository.getConnectDB();
        try {
            CallableStatement cs = conn.prepareCall(queryById);

            cs.setInt(1, id);

            ResultSet rs = cs.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                user = new User(id, name, email, country);
            }

        } catch (SQLException throwAbles) {
            throwAbles.printStackTrace();
        }
        return user;
    }


    @Override
    public void insertUserStore(User user) throws SQLException {
        String insertUserSql = "insert into users (name,email,country) values (?,?,?);";

        Connection connection = BaseRepository.getConnectDB();

        CallableStatement cs = connection.prepareCall(insertUserSql);

        cs.setString(1, user.getName());
        cs.setString(2, user.getEmail());
        cs.setString(3, user.getCountry());

        cs.executeUpdate();
    }



    @Override
    public List<User> selectAllUsersPro() {
        List<User> users = new ArrayList<>();
        String selectAllUsersSql = "{call select_all_users()}";

        Connection connection = BaseRepository.getConnectDB();

        try {
            CallableStatement cs = connection.prepareCall(selectAllUsersSql);

            ResultSet rs = cs.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String country = rs.getString("country");
                String email = rs.getString("email");
                users.add(new User(id, name, country, email));
            }
        } catch (SQLException throwAbles) {
            throwAbles.printStackTrace();
        }

        return users;
    }

    @Override
    public void updateUserPro(User user) throws SQLException {
        String updateUserSqlPro = "{call update_user(?,?,?,?)}";

        Connection connection = BaseRepository.getConnectDB();

        CallableStatement cs = connection.prepareCall(updateUserSqlPro);

        cs.setString(1, user.getName());
        cs.setString(2, user.getEmail());
        cs.setString(3, user.getCountry());
        cs.setInt(4, user.getId());

        cs.executeUpdate();
    }


    @Override
    public void deleteUserPro(int id) {
        String deleteUserSqlPro = "{call delete_user(?)}";

        Connection connection = BaseRepository.getConnectDB();

        try {
            CallableStatement cs = connection.prepareCall(deleteUserSqlPro);

            cs.setInt(1, id);

            cs.executeUpdate();

        } catch (SQLException throwAbles) {
            throwAbles.printStackTrace();
        }


    }
    }

