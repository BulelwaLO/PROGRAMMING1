/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.part1;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class register {
     //global variables
    public static String name;
    public static String surname;
    public static String username;
    public static String password;
    
    //object declared to call all methods and variable from login class
    public login log = new login();
 
//method to register user    
public void registerUser(){
    
//scanner to accept user's input
Scanner scn = new Scanner(System.in);

System.out.println(":::::::::::::::::::::::::::REGISTRATION:::::::::::::::::::::::::::::::::");

System.out.println("\nEnter first name :");
name = scn.nextLine();


System.out.println("Enter second name :");
surname = scn.nextLine();

//do while loop to keep prompting the user
do{
   System.out.println("Enter username(username must have an underscore and is not more than 5 in length) :");
   username = scn.nextLine();
}
while(log.checkUserName(username)!=true);
        
do{
   System.out.println("\nEnter password(Password does not meet complexity, must contain Uppercase letter,\n" +
                      "must be 8 long, must contain a number and a special character) :");
   password = scn.nextLine();
}
while(log.checkPasswordComplexity(log.checkChar(password), log.checkNumber(password), log.checkLength(password), log.checkCaps(password))!=true);       
}    
    
}

    

