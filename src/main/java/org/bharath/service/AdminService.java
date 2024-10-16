package org.bharath.service;

import org.bharath.model.Center;
import org.bharath.model.TimeSlot;
import org.bharath.model.Workout;
import org.bharath.model.WorkoutType;

import java.time.LocalDate;
import java.util.List;

public class AdminService {

    List<Workout> workoutList;
    public void addWorkout(Center center, WorkoutType workoutType, TimeSlot slot, int capacity, LocalDate start, LocalDate end) {
        for(LocalDate date = start; date.isBefore(end.plusDays(1)); date = date.plusDays(1)) {
            Workout workout = new Workout(date, slot, capacity, center);
            workoutList.add(workout);
        }
    }

}
