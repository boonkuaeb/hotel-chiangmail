package com.ascendcorp.ctaworkshop.hotelchiangmai.repository;

import com.ascendcorp.ctaworkshop.hotelchiangmai.entity.Room;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;
@Repository
public class RoomRepository {

    // EntityManager : manage connection to database ( this is JPA )
    // PersistenceContext is used for EntityManager
    @PersistenceContext
    private EntityManager entityManager;

    public List<Room> findAll() {
        // JPQL syntax , Employee is object not Table Database
        Query query = entityManager.createQuery("from Room");
        return query.getResultList();
    }

    public Room findById(Long id) {
        return entityManager.find(Room.class, id);
    }

    @Transactional
    public Room save(Room room)
    {
        entityManager.persist(room);
        return room;
    }


}
