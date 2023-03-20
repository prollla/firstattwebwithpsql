package com.example.firstatt.controllers;


import com.example.firstatt.model.Station;
import com.example.firstatt.services.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/station")
public class StationController {
    private final StationService stationService;

    @Autowired
    public StationController(StationService stationService){
        this.stationService = stationService;
    }
    @GetMapping()
    public List<Station> getStation(){
        return stationService.getStation();
    }
    @GetMapping("/{color}")
    public List<Station> getStation(@PathVariable("color")String color){
        return stationService.getStationByColor(color);
    }
    @PostMapping("/create")
    public ResponseEntity<HttpStatus>create(@RequestBody Station station){
        stationService.save(station);
        return ResponseEntity.ok(HttpStatus.OK);
    }
    @DeleteMapping("/delete/{color}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("color")String color){
        stationService.deleteByColor(color);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
