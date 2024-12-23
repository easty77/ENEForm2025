package ene.eneform.smartform.entities;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class Runner {
    @Id
    public Integer runnerId;
    @Id
    public Integer raceId;
    public String name;
    public String formFigures;
    public Integer age;
    public Integer clothNumber;
    public Integer stallNumber;
    public Integer trainerId;
    public Integer jockeyId;
    public Integer longHandicap;
    public Integer daysSinceRan;
    public Integer weightPounds;
    public String forecastPrice;
    public Double forecastPriceDecimal;
    public Integer officialRating;

    //public Integer penaltyWeight;     // weight_penalty for daily and penalty_weight for historic!

    public String ownerName;
    public String jockeyName;
    public String trainerName;
    public Integer jockeyClaim;

}
