package progpartone;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestProgPartOne {

    // Method tests if the tester login status message returns properly formatted greeting
    @Test
    public void testReturnLoginStatusSuccess() {
        LogIn login = new LogIn("Kyle", "Joseph", "kyl_1", "Ch&&sec@ke99!", "+27838968976");
        String expected = "Welcome Kyle ,Joseph it is great to see you.";
        String actual = login.returnLoginStatus(true);
        assertEquals(expected, actual);
    }

    // Method tests if username incorrectly formatted error message is returned
    @Test
    public void testRegisterUserUsernameFailureMessage() {
        LogIn login = new LogIn("Kyle", "Joseph", "kyle!!!!!!", "Ch&&sec@ke99!", "+27838968976");
        String expected = "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than 5 characters in length.";
        String actual = login.registerUser();
        assertEquals(expected, actual);
    }

    // Method tests if password complexity failure message is returned
    @Test
    public void testPasswordComplexityFailureMessage() {
        LogIn login = new LogIn("Kyle", "Joseph", "kyl_1", "password", "+27838968976");
        String expected = "Password is not correctly formatted; please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.";
        String actual = login.registerUser();
        assertEquals(expected, actual);
    }

    // Method tests if cell number incorrectly formatted error message is returned
    @Test
    public void testCellPhoneNumberFailureMessage() {
        LogIn login = new LogIn("Kyle", "Joseph", "kyl_1", "Ch&&sec@ke99!", "08966553");
        String expected = "Cell number is incorrectly formatted or does not contain an international code; please correct the number and try again.";
        String actual = login.registerUser();
        assertEquals(expected, actual);
    }

    // Method tests if login successful returns true
    @Test
    public void testLoginUserSuccess() {
        LogIn login = new LogIn("Kyle", "Joseph", "kyl_1", "Ch&&sec@ke99!", "+27838968976");
        assertTrue(login.loginUser("kyl_1", "Ch&&sec@ke99!"));
    }

    // Method tests if login failed returns false
    @Test
    public void testLoginUserFailure() {
        LogIn login = new LogIn("Kyle", "Joseph", "kyl_1", "Ch&&sec@ke99!", "+27838968976");
        assertFalse(login.loginUser("kyl_1", "wrongPass"));
    }

    // Method tests if username correctly formatted returns true
    @Test
    public void testCheckUsernameSuccess() {
        LogIn login = new LogIn("Kyle", "Joseph", "kyl_1", "Ch&&sec@ke99!", "+27838968976");
        assertTrue(login.checkUsername());
    }

    // Method tests if username incorrectly formatted returns false
    @Test
    public void testCheckUsernameFailure() {
        LogIn login = new LogIn("Kyle", "Joseph", "kyle!!!!!!", "Ch&&sec@ke99!", "+27838968976");
        assertFalse(login.checkUsername());
    }

    // Method tests if password meets complexity requirements returns true
    @Test
    public void testCheckPasswordComplexitySuccess() {
        LogIn login = new LogIn("Kyle", "Joseph", "kyl_1", "Ch&&sec@ke99!", "+27838968976");
        assertTrue(login.checkPasswordComplexity());
    }

    // Method tests if password does not meet complexity requirements returns false
    @Test
    public void testCheckPasswordComplexityFailure() {
        LogIn login = new LogIn("Kyle", "Joseph", "kyl_1", "password", "+27838968976");
        assertFalse(login.checkPasswordComplexity());
    }

    // Method tests if cell phone number correctly formatted returns true
    @Test
    public void testCheckCellphoneNumberSuccess() {
        LogIn login = new LogIn("Kyle", "Joseph", "kyl_1", "Ch&&sec@ke99!", "+27838968976");
        assertTrue(login.checkCellphoneNumber());
    }

    // Method tests if cell phone number incorrectly formatted returns false
    @Test
    public void testCheckCellphoneNumberFailure() {
        LogIn login = new LogIn("Kyle", "Joseph", "kyl_1", "Ch&&sec@ke99!", "08966553");
        assertFalse(login.checkCellphoneNumber());
    }
}