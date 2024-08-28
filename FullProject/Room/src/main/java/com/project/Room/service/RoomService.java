package com.project.Room.service;

import com.project.Room.entity.Room;
import com.project.Room.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;
    public List<Room> getRoomsBylocation(String location)
    {
        return roomRepository.findByLocations(location);
    }

}
