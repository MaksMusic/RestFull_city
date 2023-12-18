package com.maksud.spring_boot.project.city.repozitory;

import com.maksud.spring_boot.project.city.model.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CitizenRepository extends JpaRepository<Citizen,Long> {
    Citizen getFirstByName (String name);

    @Query("SELECT DISTINCT c FROM Citizen c JOIN c.homes h WHERE upper(h.street) = upper(:street)")
    List<Citizen> findCitizensByStreet(@Param("street") String street);

}
