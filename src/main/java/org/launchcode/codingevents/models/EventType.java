package org.launchcode.codingevents.models;

public enum EventType {

    CONFERENCE("Conference"),
    MEETUP("Meetup"),
    WORKSHOP("Workshop"),
    SOCIAL("Social");

    private final String displayName;
    private final Boolean isLame;

    EventType(String displayName) {
        this.displayName = displayName;
        this.isLame = true;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Boolean getIsLame() {
        return isLame;
    }
}
