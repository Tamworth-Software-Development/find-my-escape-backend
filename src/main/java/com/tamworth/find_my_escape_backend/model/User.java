package com.tamworth.find_my_escape_backend.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "user")
public class User {
    @Id
    @NonNull
    @Column
    private String userId;

    @Column
    private String name;

    @Column
    private String emailAddress;

    @Column
    private String current_Search;

    @Column
    @OneToMany(mappedBy = "FavLocationUser")
    @JoinTable(
            name= "UserFavouriteLocation",
            joinColumns = @JoinColumn(name = "userId"),
            inverseJoinColumns = @JoinColumn(name = "locationId"),
            uniqueConstraints = @UniqueConstraint(columnNames = {"userId", "locationId"})
    )
    private Set<FavouriteLocation> favouriteLocations = new HashSet<>();

    @Column
    @OneToMany(mappedBy = "FavActivityUser")
    @JoinTable(
            name= "UserFavouriteLocation",
            joinColumns = @JoinColumn(name = "userId"),
            inverseJoinColumns = @JoinColumn(name = "activityId"),
            uniqueConstraints = @UniqueConstraint(columnNames = {"userId", "activityId"})
    )
    private Set<FavouriteActivity> favouriteActivities = new HashSet<>();

}
