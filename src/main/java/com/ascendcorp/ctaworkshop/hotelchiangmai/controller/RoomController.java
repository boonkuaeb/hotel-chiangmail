package com.ascendcorp.ctaworkshop.hotelchiangmai.controller;

import com.ascendcorp.ctaworkshop.hotelchiangmai.entity.Room;
import com.ascendcorp.ctaworkshop.hotelchiangmai.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/room")
@CrossOrigin(origins = "*")
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
    public Room updateRoomById(@PathVariable Long id, @RequestBody Room roomParam) {
        Room roomEntity = roomService.get(id);
        roomEntity.setName(roomParam.getName());
        roomEntity.setNumber(roomParam.getNumber());
        roomEntity.setBedInfo(roomParam.getBedInfo());
        return roomService.save(roomEntity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteRoomById(@PathVariable Long id) {
        roomService.delete(id);
    }

}
