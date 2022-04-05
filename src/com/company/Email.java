package com.company;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public static boolean validateEmail(String s) {

        String regex = "^(.+)@(.+)$";

        Pattern emailPattern = Pattern.compile ( regex );

        Matcher emailMatch = emailPattern.matcher (s);

        return emailMatch.matches ();
    }
}
