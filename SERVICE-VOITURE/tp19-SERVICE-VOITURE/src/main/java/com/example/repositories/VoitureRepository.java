package com.example.repositories;

import com.example.entities.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface VoitureRepository extends JpaRepository<Voiture, Long> {
    @Query("SELECT v FROM Voiture v WHERE v.id_client = :clientId")
    List<Voiture> findByClientId(@Param("clientId") Long clientId);

    @Query("SELECT v FROM Voiture v WHERE v.id_client = :idClient")
    List<Voiture> findByIdClient(@Param("idClient") Long idClient);
}
