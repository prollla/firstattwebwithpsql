package com.example.firstatt.repositories;

import com.example.firstatt.model.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StationRepository extends JpaRepository<Station, Long> {
    List<Station> findByColor(String color);
    void deleteByColor(String Color);
}
