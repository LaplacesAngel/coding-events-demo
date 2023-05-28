package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EventDetails {
    @Id
    @GeneratedValue
    private int id;
    private String contactEmail;

    private String description;
}
