package com.metapack.estimatedpackagedeliverytime.service;

import com.metapack.estimatedpackagedeliverytime.entity.User;
import com.metapack.estimatedpackagedeliverytime.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;
    private int flag = 0;

    @Autowired
    public UserService(UserRepository repository)
    {
        userRepository = repository;
    }

    public User save(User user)
    {
        return userRepository.save(user);
    }

    public boolean findByUsername(User user) {
        Iterable<User> users = userRepository.findAll();
        for (User item : users) {
            if (item.getUsername().equals(user.getUsername()) && item.getPassword().equals(user.getPassword()))
            {
                flag = 1;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
