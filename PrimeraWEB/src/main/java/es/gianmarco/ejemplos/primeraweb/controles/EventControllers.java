package es.gianmarco.ejemplos.primeraweb.controles;

import es.gianmarco.ejemplos.primeraweb.model.Event;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/event")
public class EventControllers {


    //@RequestMapping(value = "/eventos", method = RequestMethod.GET)
   @GetMapping({"", "/"})

    public ModelAndView getAllEvents() {
       ModelAndView modelView = new ModelAndView();


    List<Event> events = new ArrayList<>();
    events.add(new Event(1,"Evento 1","Description evento 1", LocalDateTime.now(),LocalDateTime.now()));
       events.add(new Event(2,"Evento 2","Description evento 2", LocalDateTime.now(),LocalDateTime.now()));
       events.add(new Event(3,"Evento 3","Description evento 3", LocalDateTime.now(),LocalDateTime.now()));
    modelView.addObject("events", events);
    modelView.setViewName("event-list");
       return modelView;
    }
@GetMapping("/new")
public String getCreateForm(HttpServletRequest request){
        return "create-event";
}
    @PostMapping("/new")
    public String createEvent(){
        return "evento-creado";
    }

    @GetMapping("/{id}")
    public String getEventDetail(@PathVariable(name = "id") int eventId, Model model) {
        System.out.println("Id recibido: " + eventId);
    Event a = new Event(1,"Comida con los amigos en Acocebre","Nos vamos a la plaza mayou a comer un bocadillo de calamares", LocalDateTime.now().plusDays(2), LocalDateTime.now().plusHours(5));
    Event a2 = new Event(2,"");
    model.addAttribute("eventId", eventId);
    model.addAttribute("event", a).addAttribute("otraCosas", "Esto es otra cosa");

    return "detalle-evento";

    }
private Iterable<String> getLanguages(){
       List<String> languages = new ArrayList<>();
    languages.add("English");
    languages.add("Spanish");
    languages.add("French");
    languages.add("German");
    return languages;
    
}


}
