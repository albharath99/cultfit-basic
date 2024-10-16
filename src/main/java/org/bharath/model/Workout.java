package org.bharath.model;

import java.time.LocalDate;

public class Workout {
    LocalDate date;
    TimeSlot slot;
    int capacity;
    int bookedCount;
    Center center;

    public Workout(LocalDate date, TimeSlot slot, int capacity, Center center) {
        this.date = date;
        this.slot = slot;
        this.capacity = capacity;
        this.center = center;
    }
}
