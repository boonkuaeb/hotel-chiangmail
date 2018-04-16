package com.ascendcorp.ctaworkshop.hotelchiangmai.controller;

import com.ascendcorp.ctaworkshop.hotelchiangmai.entity.Room;
import com.ascendcorp.ctaworkshop.hotelchiangmai.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @RequestMapping
    public List<Room> getAllRoom() {
        return roomService.listAll();
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
