package org.example.app.utils;
import java.util.regex.Pattern;

public class EmailValidator {
    private static final String EMAIL_RGX = "^[A-Za-z0-9+_.-]+@(.+)$";

    public static boolean isEmailValid(String email) {
        return Pattern.compile(EMAIL_RGX).matcher(email).matches();
    }
}
