package hilelll.jdbc.practice1.service;

import hilelll.jdbc.practice1.util.Databese;
import hilelll.jdbc.practice1.entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    private String QUERY_SAVE = "INSERT INTO customers (name, surname, email, password, age) VALUES (?,?,?,?,?)";
    private String QUERY_GET_ALL = "SELECT * FROM users";

    public List<User> getAll() {


        List<User> users = new ArrayList<>();
        try (
                Connection connection = Databese.getConnection();
                Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(QUERY_GET_ALL);
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                User user = new User();
//                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setName(resultSet.getString("surname"));
                user.setName(resultSet.getString("email"));
                user.setName(resultSet.getString("password"));
                user.setId(resultSet.getInt("age"));
                users.add(user);
                // init settings
            }
            connection.commit();

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return users;
    }

    public void save(User user) {
        try (Connection connection = Databese.getConnection();
             PreparedStatement preparedStatement = connection.
                     prepareStatement(QUERY_SAVE)) {
            connection.setAutoCommit(false);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getSurname());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getPassword());
            preparedStatement.setInt(5, user.getAge());
            //init settings
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
