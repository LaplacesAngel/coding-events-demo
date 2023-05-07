package org.launchcode.codingevents.models;

public enum Day {

        SUNDAY("Sunday", false),
        MONDAY("Monday",true),
        TUESDAY("Tuesday", true),
        WEDNESDAY("Wednesday", true),
        THURSDAY("Thursday", true),
        FRIDAY("Friday",true),
        SATURDAY("Saturday",false);

        private final String displayName;
        private final Boolean weekday;

        Day(String displayName, Boolean weekday) {
                this.displayName = displayName;
                this.weekday = weekday;
        }

        public String getDisplayName() {
                return this.displayName;
        }

        public Boolean getWeekday() {
                return this.weekday;
        }


}


