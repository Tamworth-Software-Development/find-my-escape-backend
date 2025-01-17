package com.tamworth.find_my_escape_backend.service;

import com.tamworth.find_my_escape_backend.exception.ResourceNotFoundException;
import com.tamworth.find_my_escape_backend.model.Activity;
import com.tamworth.find_my_escape_backend.model.Location;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class LocationServiceImpl implements LocationService {

    @Override
    public Location findLocationInformation(String locationName) {
        RestTemplate restTemplate = new RestTemplate();
        String locationInformationEndPoint =
                "https://en.wikipedia.org/w/api.php?action=query&titles="
                + locationName
                + "&format=json&prop=pageimages%7Cextracts&formatversion=2&piprop=original"
                + "&pithumbsize=1000&pilicense=free&exchars=250&exintro=1&explaintext=1";

        return restTemplate.getForObject(locationInformationEndPoint, Location.class);
    }

}