package com.example.usermanager.service;

import com.example.usermanager.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao implements IUserDAO {

    @Override
    public void insertUser(User user) throws SQLException, ClassNotFoundException {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection connection = connectJDBC.getConnection();

        String query = "insert into users (name, email, country) values (?, ?, ?);";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, user.getName());
        preparedStatement.setString(2, user.getEmail());
        preparedStatement.setString(3, user.getCountry());

        preparedStatement.executeUpdate();

    }

    @Override
    public User selectUser(int id) throws SQLException, ClassNotFoundException {
        User user = null;
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection connection = connectJDBC.getConnection();

        String query = "select id,name,email,country from users where id =?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            String email = resultSet.getString("email");
            String country = resultSet.getString("country");
            user = new User(id, name, email, country);
        }
        return user;
    }

    @Override
    public List<User> selectAllUser() throws SQLException, ClassNotFoundException {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection connection = connectJDBC.getConnection();
        List<User> users = new ArrayList<>();

        String query = "select * from users";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String email = resultSet.getString("email");
            String country = resultSet.getString("country");
            users.add(new User(id, name, email, country));
        }
        return users;
    }

    @Override
    public boolean deleteUser(int id) throws SQLException, ClassNotFoundException {
        boolean rowDelete;
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection connection = connectJDBC.getConnection();

        String query = "delete from users where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        rowDelete = preparedStatement.executeUpdate() > 0;
        return rowDelete;
    }

    @Override
    public boolean updateUser(User user) throws SQLException, ClassNotFoundException {
        boolean rowUpdated;
        ConnectJDBC connectJDBC = new ConnectJDBC();
        connectJDBC.getConnection();

        String query = "update users set name = ?,email= ?, country =? where id = ?";
        PreparedStatement preparedStatement = connectJDBC.getConnection().prepareStatement(query);
        preparedStatement.setString(1, user.getName());
        preparedStatement.setString(2, user.getEmail());
        preparedStatement.setString(3, user.getCountry());
        preparedStatement.setInt(4, user.getId());

        rowUpdated = preparedStatement.executeUpdate() > 0;
        return rowUpdated;

    }

    @Override
    public List<User> searchByName(String keyword) throws SQLException, ClassNotFoundException {
        List<User> users = new ArrayList<>();
        ConnectJDBC connectJDBC = new ConnectJDBC();
        connectJDBC.getConnection();

        String query = "select * from users where name like ? ";
        PreparedStatement preparedStatement = connectJDBC.getConnection().prepareStatement(query);
        preparedStatement.setString(1,'%' + keyword + '%');
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String email = resultSet.getString("email");
            String country = resultSet.getString("country");
            users.add(new User(id, name, email, country));
        }
       return users;
    }


}
