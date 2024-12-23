package ene.eneform.smartform.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="daily_races")
@Getter
@ToString
@NoArgsConstructor(force=true)
public class DailyRace {
    @Id
    public Integer raceId;
    public String course;
    public LocalDate meetingDate;
    public String raceTitle;
    public String raceType;
    public String trackType;
    @OneToMany(mappedBy="raceId", fetch=FetchType.EAGER)
    public List<DailyRunner> runners;
}
