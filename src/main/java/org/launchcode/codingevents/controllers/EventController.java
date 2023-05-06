package org.launchcode.codingevents.controllers;

import org.apache.coyote.Request;
import org.launchcode.codingevents.data.EventData;
import org.launchcode.codingevents.models.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chris Bay
 */
@Controller
@RequestMapping("events")
public class EventController {


    @GetMapping
    public String displayAllEvents(Model model) {
        model.addAttribute("title", "All Events");
        model.addAttribute("events");
        return "events/index";
    }

    @GetMapping("create")
    public String displayCreateEventForm(Model model) {
        model.addAttribute("title", "Create Event");
        return "events/create";
    }

    @PostMapping("create")
    public String processCreateEventForm(@ModelAttribute Event newEvent) {
        EventData.add(newEvent);
        return "redirect:";
    }

    //displays the delete form
    @GetMapping("delete")
    public String displayDeleteEventForm(Model model) {
        model.addAttribute("title", "Delete Events");
        model.addAttribute("events", EventData.getAll());
        return "events/delete";
    }

    @PostMapping("delete")
    public String processDeleteEventForm(@RequestParam(required = false) int[] eventIds) {

        if(eventIds != null) {

            for (int id : eventIds) {
                EventData.remove(id);
            }
        }
        return "redirect:";
    }

/*    @GetMapping("edit/{eventID}")
    public String displayEditForm(Model model, @PathVariable int eventId) {
        model.addAttribute("event", EventData.getById(eventId));
        return "events/edit";
    }*/


    @GetMapping("edit/{eventId}")
    public String displayEditForm(Model model, @PathVariable int eventId){
        Event eventToEdit = EventData.getById(eventId);
        model.addAttribute("event", eventToEdit);
        String title = "Edit Event " + eventToEdit.getName() + " (id: " + eventToEdit.getId() + ")";
        model.addAttribute("title", title );
        return "events/edit";
    }

    @PostMapping("edit")
    public String processEditForm(int eventId, String name, String description, String location){
        Event myEvent = EventData.getById(eventId);
        myEvent.setName(name);
        myEvent.setDescription(description);
        myEvent.setLocation(location);
        return "redirect:/events";
    }


}
