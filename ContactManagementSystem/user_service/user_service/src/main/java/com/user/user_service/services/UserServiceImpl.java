package com.user.user_service.services;

import com.user.user_service.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    List<User> db = List.of(
            new User(1L,"Harsh veer singh","7828159961"),
            new User(2L,"Chandu samson","7224898062"),
            new User(3L,"Ravi kumar","7224898062")
    );

    @Override
    public User getUser(Long userId) {
        return db.stream().filter(user -> user.getUserId().equals(userId)).findAny().orElse(null);
    }

}
