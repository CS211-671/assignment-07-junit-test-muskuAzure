package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    private UserList userList;

    @BeforeEach
    void setUp() {
        userList = new UserList();
    }

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList

        userList.addUser("first","1q");
        userList.addUser("second","2q");
        userList.addUser("third","3q");

        // TODO: find one of them

        User u1 = userList.findUserByUsername("first");

        // TODO: assert that UserList found User
        // String expected = "<one of username>";
        // String actual = user.getUsername();
        // assertEquals(expected, actual);

        assertEquals("first", u1.getUsername());
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList

        userList.addUser("first","1q");
        userList.addUser("second","2q");
        userList.addUser("third","3q");

        // TODO: change password of one user

        User u1 = userList.findUserByUsername("first");
        u1.setPassword("newpass");


        // TODO: assert that user can change password
        // assertTrue(actual);


        assertTrue(u1.validatePassword("newpass"));

    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList

        userList.addUser("first","1q");
        userList.addUser("second","2q");
        userList.addUser("third","3q");

        // TODO: call login() with correct username and password

        User u1 = userList.login("first","1q");

        // TODO: assert that User object is found
        // assertEquals(expected, actual);

        assertEquals("first", u1.getUsername());
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList

        userList.addUser("first","1q");
        userList.addUser("second","2q");
        userList.addUser("third","3q");

        // TODO: call login() with incorrect username or incorrect password

        User u1 = userList.login("first","q");

        // TODO: assert that the method return null
        // assertNull(actual);

        assertNull(u1);
    }

}