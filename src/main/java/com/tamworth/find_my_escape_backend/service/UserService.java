package com.tamworth.find_my_escape_backend.service;

import com.tamworth.find_my_escape_backend.model.User;

public interface UserService {
    User findUserById(String userId);

    User saveUser(User user);

    User updateUserEmail(String userId, String email);

    User updateUserName(String userId, String name);

    User deleteUserById(String userId);

    User saveFavouriteLocation(String userId, String locationId, String locationName);

    User saveFavouriteActivity(String userId, String activity, String activityName, String activityType);

    User deleteFavouriteLocationByUserId(String UserId, String locationId);

    User deleteFavouriteActivityByUserId(String UserId, String activity);

    User getAllFavourites(String UserId);

}
