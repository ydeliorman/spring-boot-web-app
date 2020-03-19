package hotelwebapp;
/*
17.03.2020
created by yalind
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rooms")
public class RoomController {
    private RoomServices roomServices;

    @Autowired
    public RoomController(RoomServices roomServices) {
        this.roomServices = roomServices;
    }

    @GetMapping
    public String getAllRooms(Model model) {
        model.addAttribute("rooms", roomServices.getAllRooms());
        return "rooms";
    }
}
