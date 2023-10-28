package com.maksud.spring_boot.project.city.repozitory;

import com.maksud.spring_boot.project.city.model.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Citizen,Long> {
    Citizen getFirstByName (String name);



}
