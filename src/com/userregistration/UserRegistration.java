package com.userregistration;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    ArrayList<String> list = new ArrayList<>();
    private void isValidFirstName() {
        System.out.println("Checking Valid First Name:");
        list.add("Jonny");
        list.add("Lio");
        list.add("Miaa");
        list.add("John");
        String regex = "[A-Z]{1}[a-z]{3,}";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < list.size(); i++) {
            Matcher matcher = pattern.matcher(list.get(i));
            System.out.println("The first name is : ");
            System.out.println(list.get(i) + " -> " + matcher.matches());
        }}
    private void isValidSecondName() {
        System.out.println(" Checking Valid Last Name:");
        list.add("Disuza");
        list.add("Mirza");
        list.add("Hud");
        list.add("Dcruz");
        String regex = "[A-Z]{1}[a-z]{3,}";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < list.size(); i++) {
            Matcher matcher = pattern.matcher(list.get(i));
            System.out.println("The Last name is : ");
            System.out.println(list.get(i) + " -> " + matcher.matches());
        }}

    private void isValidEmailId() {
        System.out.println(" Checking Valid EmailId:");
        list.add("kajal@gmail.com");
        list.add("user@domain.co.in");
        list.add("user1@domain.com");
        list.add("user.name@domain.com");
        list.add("user#domain.com");//Invalid emails
        list.add("@yahoo.com");

        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < list.size(); i++) {
            Matcher matcher = pattern.matcher(list.get(i));
            System.out.println("The Email id is : ");
            System.out.println(list.get(i) + " -> " + matcher.matches());
        }}
    private void predefinedMobileFormat() {
        System.out.println(" Checking for predefined Mobile Format:");
        list.add("91 7890987605");
        list.add("91 8798709876");
        list.add("112 9876543214");
        String regex = "^(\\d{1,2}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$";//get prefix with 2 digits and space

        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < list.size(); i++) {
            Matcher matcher = pattern.matcher(list.get(i));
            System.out.println("The Mobile is : ");
            System.out.println(list.get(i) + " -> " + matcher.matches());
        }}
    private void passwordRuleMinimumEightCharacter() {
        System.out.println("Password Rule To give minimum 8 Characters:");
        list.add("hgythbjklo");
        list.add("oilkj");
        list.add("Hgythbjklo");
        list.add("Shoiuytld");
        String regex = "[A-Z]{1}[a-z]{8,}";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < list.size(); i++) {
            Matcher matcher = pattern.matcher(list.get(i));
            System.out.println("The Password is : ");
            System.out.println(list.get(i) + " -> " + matcher.matches());
        }}
    public static void main(String[] args) {
        System.out.println("User Registration using Regex");
        UserRegistration user = new UserRegistration();
        //user.isValidFirstName();;
        //user.isValidEmailId();
       // user.isValidSecondName()
        //user.predefinedMobileFormat();
        user.passwordRuleMinimumEightCharacter();
    }

    }
