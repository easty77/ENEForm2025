package ene.eneform.smartform.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Table(name="historic_races")
@Getter
@ToString
@NoArgsConstructor(force=true)
public class HistoricRace {
    @Id
    public Integer raceId;
    public String course;
    public LocalDate meetingDate;
    public String raceName;
    public String raceType;
    public String going;
}
