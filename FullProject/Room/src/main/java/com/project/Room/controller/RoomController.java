package com.project.Room.controller;

import com.project.Room.entity.Room;
import com.project.Room.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {
    @Autowired
    private RoomService roomService;
    @GetMapping
    public ResponseEntity<List<Room>> getRoomsByLocation(@RequestParam String location)
    {
        return ResponseEntity.ok(roomService.getRoomsBylocation(location));
    }
}
