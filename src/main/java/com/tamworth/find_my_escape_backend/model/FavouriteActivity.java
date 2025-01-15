package com.tamworth.find_my_escape_backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "favourite_activity")
public class FavouriteActivity {
    @Id
    @NonNull
    @Column
    private String activityId;

    @Column
    private String activityName;

    @Column
    private String activityType;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinTable(
            name= "UserFavouriteActivity",
            joinColumns = @JoinColumn(name = "activityId"),
            inverseJoinColumns = @JoinColumn(name = "userId"),
            uniqueConstraints = @UniqueConstraint(columnNames = {"activityId", "userId"})
    )
    private User favActivityUser;

}
