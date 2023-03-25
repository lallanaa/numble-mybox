package com.sh.numble.mybox.repository;

import com.sh.numble.mybox.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Slf4j
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @BeforeEach
    void setUp() {
        User user = User.builder().userId("user1").userName("일용자").password("user1").build();
        userRepository.save(user);

        user = User.builder().userId("user2").userName("이용자").password("user2").build();
        userRepository.save(user);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findByUserId() {
        User user1 = userRepository.findByUserId("user1");
        Assertions.assertEquals(user1.getUserName(), "일용자");
    }
}