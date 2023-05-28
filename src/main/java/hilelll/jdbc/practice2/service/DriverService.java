package hilelll.jdbc.practice2.service;

import hilelll.jdbc.practice2.entity.Driver;
import hilelll.jdbc.practice2.util.Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DriverService {
    private String QUERY_SAVE = "INSERT INTO racing.drivers (name, surname, email, password, age) VALUES (?,?,?,?,?)";
    private String QUERY_GET_ALL = "SELECT * FROM racing.drivers";
    private String QUERY_DELETE_BY_ID = "DELETE FROM racing.drivers WHERE id = ?";
    private String QUERY_UPDATE = "UPDATE racing.drivers set name = ?, surname = ?, password = ?, email = ?, age = ? WHERE id = ?";

    public List<Driver> getAll() {
        //Statement. Dangerous - SQL injection!

        List<Driver> drivers = new ArrayList<>();
        try (
                Connection connection = Database.getConnection();
                Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(QUERY_GET_ALL);
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                Driver driver = new Driver();
                driver.setId(resultSet.getInt("id")); // "id" and so on - name of column in table.
                driver.setName(resultSet.getString("name")); // get values one by one, exactly like in table
                driver.setSurname(resultSet.getString("surname"));
                driver.setEmail(resultSet.getString("email"));
                driver.setPassword(resultSet.getString("password"));
                driver.setAge(resultSet.getInt("age"));
                drivers.add(driver);
                // init settings
            }
            connection.commit();

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return drivers;
    }

    public void save(Driver driver) {
        // Prepared Statement. Protected from injections.
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_SAVE)) {
            connection.setAutoCommit(false);
            preparedStatement.setString(1, driver.getName());
            preparedStatement.setString(2, driver.getSurname());
            preparedStatement.setString(3, driver.getEmail());
            preparedStatement.setString(4, driver.getPassword());
            preparedStatement.setInt(5, driver.getAge());
            //init settings
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteById(int id) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_DELETE_BY_ID)) {
            connection.setAutoCommit(false);
            preparedStatement.setInt(1, id);
            //init settings
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateById(int id, Driver driver) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_UPDATE)) {
            connection.setAutoCommit(false);
            preparedStatement.setString(1, driver.getName());
            preparedStatement.setString(2, driver.getSurname());
            preparedStatement.setString(3, driver.getPassword());
            preparedStatement.setString(4, driver.getEmail());
            preparedStatement.setInt(5, driver.getAge());
            preparedStatement.setInt(6, id);
            //init settings
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
