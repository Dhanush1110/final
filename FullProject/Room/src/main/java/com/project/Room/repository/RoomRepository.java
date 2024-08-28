package com.project.Room.repository;

import com.project.Room.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository  extends JpaRepository <Room,Long> {

        List<Room> findByLocations(String location);
    }


