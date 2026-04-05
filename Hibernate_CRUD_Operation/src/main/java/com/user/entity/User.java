package com.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity     //this annotation are used to create table same name for class name
@Table(name = "users")  //it is used to give table name for our choice
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @Id  //it used to primary key for the table
    @Column (name = "userid") //it is used to give column name for our choice
    private Integer id;

    private String username;

    private String password;

    private String email;

    private String address;

//    public User() {
//        super();
//    }

//    public User(Integer id, String username, String password, String email, String address) {
//        this.id = id;
//        this.username = username;
//        this.password = password;
//        this.email = email;
//        this.address = address;
//    }

//    public Integer id() {
//        return id;
//    }
//
//    public User setId(Integer id) {
//        this.id = id;
//        return this;
//    }
//
//    public String username() {
//        return username;
//    }
//
//    public User setUsername(String username) {
//        this.username = username;
//        return this;
//    }
//
//    public String password() {
//        return password;
//    }
//
//    public User setPassword(String password) {
//        this.password = password;
//        return this;
//    }
//
//    public String email() {
//        return email;
//    }
//
//    public User setEmail(String email) {
//        this.email = email;
//        return this;
//    }
//
//    public String address() {
//        return address;
//    }
//
//    public User setAddress(String address) {
//        this.address = address;
//        return this;
//    }

//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", username='" + username + '\'' +
//                ", password='" + password + '\'' +
//                ", email='" + email + '\'' +
//                ", address='" + address + '\'' +
//                '}';
//    }
}
