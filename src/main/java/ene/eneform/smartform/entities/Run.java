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
public class Run {
    @Id
    public Integer runnerId;
    @Id
    public Integer raceId;
    public String name;
    public String ownerName;
    public String jockeyName;
    public String trainerName;

    @ManyToOne
    @JoinColumn(name="raceId", referencedColumnName="raceId")
    public HistoricRace race;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="raceId", referencedColumnName="raceId")
    @JoinColumn(name="runnerId", referencedColumnName="runnerId")
    @MapsId
    public DailyRunner dailyRunner;
}
