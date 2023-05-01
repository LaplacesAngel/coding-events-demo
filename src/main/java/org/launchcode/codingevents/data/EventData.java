package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {

    //place to put events
    //data structure of some type - will be our main property of the class
    // need a place to put events
    //making it final so once the field is initiated it can't change, meaning the map itself can't change


    private static final Map<Integer, Event> events = new HashMap<>();

    // should be able to get all events
    public static Collection<Event> getAll(){
        return events.values();
    }

    // get a single event
    public static Event getById(int id){
        return events.get(id);
    }

    // add an event
    public static void add (Event event) {
        events.put(event.getId(), event);
    }

    // remove an event - removes a single event from the events map
    public static void remove(int id){
        events.remove(id);
    }

}
