package com.project.Customer.service;

import com.project.Customer.Repository.UserRepository;
import com.project.Customer.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User register(User user)
    {
        return userRepository.save(user);
    }
    // Other Services in future..

}
