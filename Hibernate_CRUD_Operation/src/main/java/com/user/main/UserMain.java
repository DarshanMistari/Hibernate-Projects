package com.user.main;

import com.user.controller.UserController;
import com.user.entity.User;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class UserMain {

    public static void main(String[] args) {

        UserController userController = new UserController();
        User user = new User();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("**** Welcome to User Management System ****");

            System.out.println("1.Add User");
            System.out.println("2.Update User");
            System.out.println("3.Get All User");
            System.out.println("4.Delete User");
            System.out.println("5.Invalid Choice");

            System.out.println("Please select Operation on User :");
            int choice = scanner.nextInt();

            if(choice == 1){
                System.out.println("Enter User ID :");
                int userId = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Enter User Name :");
                String userName = scanner.nextLine();

                System.out.println("Enter User Password :");
                String userPassword = scanner.nextLine();

                System.out.println("Enter User Email :");
                String userEmail = scanner.nextLine();

                System.out.println("Enter User Address :");
                String userAddress = scanner.nextLine();

                user.setId(userId);
                user.setUsername(userName);
                user.setPassword(userPassword);
                user.setEmail(userEmail);
                user.setAddress(userAddress);

                String msg = userController.saveUser(user);
                System.out.println(msg);
            }
            else if (choice == 2) {

                System.out.println("Enter User ID :");
                int userId = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Enter User Name :");
                String userName = scanner.nextLine();

                System.out.println("Enter User Password :");
                String userPassword = scanner.nextLine();

                System.out.println("Enter User Email :");
                String userEmail = scanner.nextLine();

                System.out.println("Enter User Address :");
                String userAddress = scanner.nextLine();

                user.setId(userId);
                user.setUsername(userName);
                user.setPassword(userPassword);
                user.setEmail(userEmail);
                user.setAddress(userAddress);

                String msg = userController.updateUser(user);
                System.out.println(msg);
            }
            else if (choice == 3) {

                List<User> userList = userController.getAllUser();

                for (User user1: userList){
                    System.out.println("User Id :"+user1.getId());
                    System.out.println("User Name :"+user1.getUsername());
                    System.out.println("User Password :"+user1.getPassword());
                    System.out.println("User Email :"+user1.getEmail());
                    System.out.println("User Address :"+user1.getAddress());
                    System.out.println("=======================================");
                }
            }
            else if (choice == 4) {
                String msg = userController.deleteUser(2);
                System.out.println(msg);
            }
            else if (choice == 5) {
                System.out.println("Thank you");
                break;
            }
            else{
                System.out.println("Invalid Choice,Please try Against.");
            }
        }

    }
}
