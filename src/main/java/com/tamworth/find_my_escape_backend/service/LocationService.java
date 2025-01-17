package com.tamworth.find_my_escape_backend.service;

import com.tamworth.find_my_escape_backend.model.Activity;
import com.tamworth.find_my_escape_backend.model.Location;

import java.util.List;

public interface LocationService {
    Location findLocationInformation(String locationName);

    List<Activity> findActivitiesAtLocation(String locationId, String activityType); //activity type default to all types

    Activity findActivityById(String activityId);
}
