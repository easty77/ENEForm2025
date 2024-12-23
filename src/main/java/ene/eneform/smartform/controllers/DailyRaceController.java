package ene.eneform.smartform.controllers;

import ene.eneform.smartform.entities.DailyRace;
import ene.eneform.smartform.entities.Run;
import ene.eneform.smartform.repositories.DailyRaceRepository;
import ene.eneform.smartform.repositories.RunRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Controller
@AllArgsConstructor
public class DailyRaceController {
@Autowired
    private DailyRaceRepository dailyRaceRepository;
    @Autowired
    private RunRepository runRepository;

    @GetMapping("/today")
    String hello(ModelMap model) {
        System.out.println("In controller hello");
        List<DailyRace> races = dailyRaceRepository.findByMeetingDate(LocalDate.now());
        model.put("races", races);
        return "displayRaces";
    }
    @GetMapping("/frankel")
    String frankel(ModelMap model) {
        System.out.println("In controller hello");
        List<Run> runs = runRepository.findRunsByName("Frankel");
        model.put("runs", runs);
        return "displayRuns";
    }
}