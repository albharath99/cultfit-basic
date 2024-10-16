package org.bharath.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TimeSlot {
    MORN_SIX_TO_SEVEN(6, 7),
    MORN_SEVEN_TO_EIGHT(7,8),
    EVE_SIX_TO_SEVEN(18, 19),
    EVE_SEVEN_TO_EIGHT(19,20);

    private final int startHour, endHour;

}
