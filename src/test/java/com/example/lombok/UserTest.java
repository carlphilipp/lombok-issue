package com.example.lombok;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    void userTest() {
        User user = User.builder().build();
        assertNotNull(user);

        UserRecord userRecord = UserRecord.builder().build();
        assertNotNull(userRecord);
    }
}
