package ene.eneform.smartform.entities;

import lombok.Data;

import java.io.Serializable;

@Data
public class RunId implements Serializable {
    private Integer raceId;
    private Integer runnerId;
}