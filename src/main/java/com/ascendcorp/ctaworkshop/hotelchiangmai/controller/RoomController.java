package com.ascendcorp.ctaworkshop.hotelchiangmai.controller;

import com.ascendcorp.ctaworkshop.hotelchiangmai.entity.Room;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {

    @RequestMapping
    public String getAllRoom() {
        return "All rooms";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getRoomById(@PathVariable Integer id) {
        return "Get room by roomId";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String createNewRoom(@RequestBody Room roomParam) {
        return "Create new Rooms";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateRoomById(@PathVariable Integer id, @RequestBody Room roomParam) {
        return "Update rooms";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteRoomById(@PathVariable Integer id) {
        return "Delete rooms";
    }

}
