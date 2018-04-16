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
    public Room getRoomById(@PathVariable Long id) {
        return roomService.get(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Room createNewRoom(@RequestBody Room roomParam) {
        Room roomSaved = roomService.save(roomParam);
        return roomSaved;
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
