package com.anti.webleruserregistrationlogingyepi.service;

import com.anti.webleruserregistrationlogingyepi.persistence.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
}
