package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EventDetails extends AbstractEntity{

    private String contactEmail;

    private String description;

    public EventDetails(String contactEmail, String description) {
        this.contactEmail = contactEmail;
        this.description = description;
    }

    public EventDetails() {
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
