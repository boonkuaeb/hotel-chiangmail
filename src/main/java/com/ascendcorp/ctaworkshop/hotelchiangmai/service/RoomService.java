package com.ascendcorp.ctaworkshop.hotelchiangmai.service;

import com.ascendcorp.ctaworkshop.hotelchiangmai.entity.Room;
import com.ascendcorp.ctaworkshop.hotelchiangmai.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    public List<Room> listAll(){
        return roomRepository.findAll();
    }

    public Room get(Long id){
        return roomRepository.findById(id);
    }

    @Transactional
    public Room save(Room room)
    {
        return roomRepository.save(room);
    }


}
