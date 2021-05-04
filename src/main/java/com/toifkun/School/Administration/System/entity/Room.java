package com.toifkun.School.Administration.System.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "rooms")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "classroomNumber", nullable = false, length = 15)
    private String classroomNumber;

    @JsonIgnore
    @OneToMany(mappedBy = "room")
    private List<TimeTableEntity> timeTableEntities = new ArrayList<>();

    public Room(String classroomNumber){
        this.classroomNumber = classroomNumber;
    }

    public List<TimeTableEntity> getTimeTableEntities() {
        return timeTableEntities;
    }

    public void setTimeTableEntities(List<TimeTableEntity> timeTableEntities) {
        this.timeTableEntities = timeTableEntities;
    }
}
