/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.part1;

import java.util.Scanner;
import java.util.regex.Pattern;





/**
 *
 * @author Bulelwa
 */
public class login {

//global variables    
public static String search;
public static boolean checkPassword = false;
public static boolean checkUser = false;
public static String user;
public static String pass;
 
//method to check username
public boolean checkUserName(String user){

//condition    
if(!user.contains("_") || user.length() > 5){
 checkUser = false;   
    System.out.println("\nIncorrect username entered, ensure that\n"
            + "Username has an underscore and is not more than 5\n"
            + "characters long\n");
return false;


}
else if(user.length() == 5 || user.length() < 5 && user.contains("_")){
checkUser = true;    
    System.out.println("\nUsername successfully captured\n");
    
    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
return true;
}

return false;
}

//method to check password complexity
public boolean checkPasswordComplexity(boolean Ch, boolean N, boolean L, boolean C){

//variable    
boolean results = false;

//condition to check all requirements
if(!Ch && !N && !L && !C){

System.out.println("Password does not meet complexity, must contain Uppercase letter,\n"
        + "must be 8 long, must contain a number and a special character");
results = false;
}
else if(Ch && N && L && C){
System.out.println("\nPassword successfully captured\n");

System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
results = true;
}

return results;
}

//method to check uppercase letters
public boolean checkCaps(String pass){

//variable declared
boolean result = false;

//object of Pattern class to check for uppercases
Pattern checkCaps = Pattern.compile("[QWERTYUIOPASDFGHJKLZXCVBNM]");

//condition    
if(checkCaps.matcher(pass).find()){
result = true;

}
return result;
}

//method to check length of password
public boolean checkLength(String pass){
boolean result = false;   
    

if(pass.length() <= 8){
result = true;

}
return result;
}

//method to check for special characters
public boolean checkChar(String pass){

//variable declared    
boolean result = false;   

//object of Pattern class to check for special characters
Pattern checkChar = Pattern.compile("[`~!@#$%^&*()-+={}';:/?.><|]");

//condition
if(checkChar.matcher(pass).find()){
result = true;
}

return result;
}

//method to check for numbers
public boolean checkNumber(String pass){
boolean result = false;

//object of Pattern class to check for numbers
Pattern checkChar = Pattern.compile("[1234567890]");

//condition
if(checkChar.matcher(pass).find()){
   result = true; 
}

return result;
}

//method to check login status
static boolean returnLoginStatus(String username, String password){

//variable
boolean check = false;

//checking, both username and password are correct
if(register.username.equals(username) && register.password.equals(password)){
System.out.println("\n=========================================================================");
System.out.println("Welcome back"+" "+register.name+" "+register.surname+",\n"
        + "its nice to see you again");

check = true;
}

//checking, wrong password and correct username 
else if(register.username.equals(username) && ! register.password.equals(password)){
System.out.println("\nIncorrect password, try again\n");

check = false;
}
//checking, wrong username and coorect password
else if(!register.username.equals(username) && register.password.equals(password)){
System.out.println("\nIncorrect username, try again\n");
 check = false;   
}
//checking, wrong password and wrong username
else if(!register.username.equals(username) && !register.password.equals(password)){
System.out.println("\nUsername and Password is incorrect, try again\n");
}

return check;
}


//method to login user
public static void loginUser(){

//scanner object for user input    
Scanner scn = new Scanner(System.in);
    
   
System.out.println("\n:::::::::::::::::::::::::::::LOGIN::::::::::::::::::::::::::::::::::::\n"); 
System.out.println("Use your saved details to login\n");

//do while loop to keep asking user's input
do{

System.out.println("Enter your username");
user = scn.nextLine();

System.out.println("Enter your Password");
pass = scn.nextLine();

}
while(returnLoginStatus(user,pass)!=true);
        
        
}
}
  
