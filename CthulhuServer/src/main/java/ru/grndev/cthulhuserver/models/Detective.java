package ru.grndev.cthulhuserver.models;

import lombok.*;

import java.time.LocalDate;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Detective {
    private Integer id;
    private String ownerName;
    private String name;
    private LocalDate birthday;
    private String fromPlace;
    private String family;
    private Integer creditRating;
    private Map<String, String> madnesses; //отдельная таблица
    private Map<String, String> traits;
    private Map<String, String> injuries;

    private String status;
    private String currentActivity;
    private String officialCauseOfDeath;
    private String realCauseOfDeath;


    private Map<String, Integer> sanityResistanceToMonsters;
}
