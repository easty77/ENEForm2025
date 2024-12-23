package ene.eneform.smartform.dal;

import ene.eneform.smartform.entities.DailyRace;
import ene.eneform.smartform.entities.Run;
import ene.eneform.smartform.repositories.DailyRaceRepository;
import ene.eneform.smartform.repositories.RunRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@SpringBootTest
public class DailyRaceDalApplicationTests {
    @Autowired
    private DailyRaceRepository raceRepository;
    @Autowired
    private RunRepository runRepository;

    @Test
    public void findDailyRaceById()  {
    Optional<DailyRace> race = raceRepository.findById(1385186);
    if (race.isPresent()) {
        DailyRace race1 = race.get();
        System.out.println(race1);
    }
    }
    @Test
    public void findDailyRaceByDate()  {
        List<DailyRace> races = raceRepository.findByMeetingDate(LocalDate.now());
        System.out.println(races.size());
    }
    @Test
    public void findRunnersByName()  {
        List<Run> runs = runRepository.findByName("Frankel");
        System.out.println(runs.size());
    }
    @Test
    public void findRunnersByName2()  {
        List<Run> runs = runRepository.findRunsByName("Frankel");
        System.out.println(runs.size());
        runs.forEach(System.out::println);
    }
}
