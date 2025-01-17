package com.tamworth.find_my_escape_backend.service;

import com.tamworth.find_my_escape_backend.model.User;
import com.tamworth.find_my_escape_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findUserById(String userId) {
        return null;
    }

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public User updateUserEmail(String userId, String email) {
        return null;
    }

    @Override
    public User updateUserName(String userId, String name) {
        return null;
    }

    @Override
    public User deleteUserById(String userId) {
        return null;
    }

    @Override
    public User saveFavouriteLocation(String userId, String locationId, String locationName) {
        return null;
    }

    @Override
    public User saveFavouriteActivity(String userId, String activity, String activityName, String activityType) {
        return null;
    }

    @Override
    public User deleteFavouriteLocationByUserId(String UserId, String locationId) {
        return null;
    }

    @Override
    public User deleteFavouriteActivityByUserId(String UserId, String activity) {
        return null;
    }

    @Override
    public User getAllFavourites(String UserId) {
        return null;
    }
}
