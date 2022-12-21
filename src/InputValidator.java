import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidator {

    public static boolean validateEmail(String email) {
        // regex pattern for validating email address
        String emailPattern = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

        // compile the pattern and create a matcher object
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);

        // return true if the email address is valid, otherwise false
        return matcher.matches();
    }

    public static boolean validatePassword(String password) {
        // password must be at least 8 characters long
        if (password.length() < 8) {
            return false;
        }

        // password must contain at least one uppercase letter
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        // password must contain at least one lowercase letter
        if (!password.matches(".*[a-z].*")) {
            return false;
        }

        // password must contain at least one digit
        if (!password.matches(".*[0-9].*")) {
            return false;
        }

        // password is valid if all the above conditions are met
        return true;
    }

    public static boolean validateUsername(String username) {
        // username must not be empty
        if (username.length() == 0) {
            return false;
        }

        // username must not contain any whitespace characters
        if (username.contains(" ")) {
            return false;
        }

        // username is valid if all the above conditions are met
        return true;
    }

}
