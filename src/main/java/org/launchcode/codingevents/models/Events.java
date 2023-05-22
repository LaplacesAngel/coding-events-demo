package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Events {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String description;
    private String contactemail;
    private String type;

    public Events(int id, String name, String description, String contactemail, String type) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.contactemail = contactemail;
        this.type = type;
    }

    public Events () {}

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactemail() {
        return contactemail;
    }

    public void setContactemail(String contactemail) {
        this.contactemail = contactemail;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
