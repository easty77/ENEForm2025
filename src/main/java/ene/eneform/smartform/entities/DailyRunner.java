package ene.eneform.smartform.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="daily_runners")
@Getter
@ToString
@NoArgsConstructor(force=true)
@IdClass(RunId.class)
public class DailyRunner extends Runner {
    public String jockeyColours;
    public Integer adjustedRating;
    private Integer courseWinner;
    private Integer distanceWinner;
    @Column(name="candd_winner")
    private Integer courseDistanceWinner;
    private Integer beatenFavourite;

}
