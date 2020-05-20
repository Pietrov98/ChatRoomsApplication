package com.Pietrov98.chatwebapp.repositories;

import com.Pietrov98.chatwebapp.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {
    //
}
