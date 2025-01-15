package com.tamworth.find_my_escape_backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "favourite_location")
public class FavouriteLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long locationId;

    @Column
    private String locationName;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinTable(
            name= "UserFavouriteLocation"
    )
    private User favLocationUser;
}
