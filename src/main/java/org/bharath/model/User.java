package org.bharath.model;

import lombok.Getter;

import java.util.List;

@Getter
public class User {
    private int id;
    private String name;
    private String email;
    private List<BookedSession> bookedSessionList;

}
