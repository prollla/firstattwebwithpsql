package com.example.firstatt.services;
import com.example.firstatt.model.Station;
import com.example.firstatt.repositories.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service
@Transactional(readOnly = true)
public class StationService {
    private final StationRepository stationRepository;
    @Autowired
    public StationService(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }


    public List<com.example.firstatt.model.Station> getStationByColor(String color) {
        return stationRepository.findByColor(color);
    }

    public List<com.example.firstatt.model.Station> getStation() {
        return stationRepository.findAll();
    }

    @Transactional
    public void save(Station station) {
        stationRepository.save(station);
    }

    @Transactional
    public void deleteByColor(String color) {
        stationRepository.deleteByColor(color);
    }
}
