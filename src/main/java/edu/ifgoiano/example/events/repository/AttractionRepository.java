package edu.ifgoiano.example.events.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ifgoiano.example.events.models.Attractions;

public interface AttractionRepository extends JpaRepository<Attractions, UUID> 
{
    Boolean existsByName(String name);
    Optional<Attractions> findByName(String name);
    boolean existsById(UUID id);
    Optional<Attractions> findById(UUID id);
}