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
    public static void main(String[] args) {
        System.out.println("User Registration using Regex");
        UserRegistration user = new UserRegistration();
        //user.isValidFirstName();
        user.isValidSecondName();
    }

    }
