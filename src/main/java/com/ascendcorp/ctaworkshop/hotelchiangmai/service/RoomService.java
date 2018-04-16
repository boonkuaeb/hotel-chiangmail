package com.ascendcorp.ctaworkshop.hotelchiangmai.service;

import com.ascendcorp.ctaworkshop.hotelchiangmai.entity.Room;
import com.ascendcorp.ctaworkshop.hotelchiangmai.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    public List<Room> listAll(){
        return roomRepository.findAll();
    }

    public Room get(Integer id){
        return roomRepository.findById(id);
    }
}
