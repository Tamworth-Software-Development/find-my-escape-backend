package com.tamworth.find_my_escape_backend.service;

import com.tamworth.find_my_escape_backend.model.Activity;
import com.tamworth.find_my_escape_backend.model.Location;

import java.util.List;

public class LocationServiceImpl implements LocationService {
    @Override
    public Location findLocationInformation(String locationName) {
        return null;
    }

    @Override
    public List<Activity> findActivitiesAtLocation(String locationId, String activityType) {
        return List.of(); // ActivityType defaults to search for all activity types.
    }

    @Override
    public Activity findActivityById(String activityId) {
        return null;
    }
}
