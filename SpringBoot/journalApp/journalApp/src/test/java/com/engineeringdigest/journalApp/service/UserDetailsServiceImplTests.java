package com.engineeringdigest.journalApp.service;

import com.engineeringdigest.journalApp.entity.User;
import com.engineeringdigest.journalApp.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.ArrayList;

import static org.mockito.Mockito.*;

@SpringBootTest
public class UserDetailsServiceImplTests {

    @InjectMocks
    private UserDetailsServiceImpl userDetailsService;

    @Mock
    private UserRepository userRepository;

    @PostConstruct
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void loadUserByUsernameTest() {
        User userEntity = new User();
        userEntity.setUserName("ram");
        userEntity.setPassword("inrinrick");
        userEntity.setRoles(new ArrayList<>());

        when(userRepository.findByUserName(ArgumentMatchers.anyString())).thenReturn(userEntity);

        UserDetails user = userDetailsService.loadUserByUsername("ram");

        Assertions.assertNotNull(user);
        Assertions.assertEquals("ram", user.getUsername());
        Assertions.assertEquals("inrinrick", user.getPassword());
    }
}
