package ene.eneform.smartform.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="historic_runners")
@Getter
@ToString
@NoArgsConstructor(force=true)
@IdClass(RunId.class)
public class HistoricRunner extends Runner {
    public Integer distanceTravelled;
    public Integer fencesJumped;
    public Integer howEasyWon;
    public String inRaceComment;
    public String officialRatingType;
    public Integer speedRating;
    public String sSpeedRatingType;
    public Integer privateHandicap;
    public String privateHandicapType;
    public String startingPrice;
    public Double sBettingText;
    public Integer positionInBetting;
    public Integer finishPosition;
    public Integer amendedPosition;
    public String unfinished;
    public Double distanceBeaten;
    public Double distanceWon;
    public Double distanceBehindWinner;
    public Double prizeMoney;
    public Double toteWin;
    public Double totePlace;
    public Integer lastRaceTypeId;
    public Integer lastRaceBeatenFav;
    public Integer overWeight;
    public Integer ownerId;
    private String lastRaceType;
}
