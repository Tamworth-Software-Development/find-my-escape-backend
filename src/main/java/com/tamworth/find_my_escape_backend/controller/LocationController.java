package com.tamworth.find_my_escape_backend.controller;

import com.tamworth.find_my_escape_backend.model.Activity;
import com.tamworth.find_my_escape_backend.model.Location;
import com.tamworth.find_my_escape_backend.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;
import java.util.List;

import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/v1/location")
public class LocationController {

    @Autowired
    LocationService locationService;

    //Get

    @GetMapping("/information")
    public ResponseEntity<Location> getLocationInformation(@RequestBody String locationName) {
        Location requestedLocation = locationService.findLocationInformation(locationName);
        HttpStatus resultingStatus = requestedLocation == null ? NOT_FOUND:OK;

        return new ResponseEntity<>(requestedLocation, resultingStatus);
    }

    @GetMapping("/activities")
    public ResponseEntity<List<Activity>> getActivities(@RequestBody String locationId) {
        return null;
    }

    @GetMapping("/activities")
    public ResponseEntity<List<Activity>> getActivitiesOfType(@RequestBody String locationId, String activityType) {
        return null;
    }

}
