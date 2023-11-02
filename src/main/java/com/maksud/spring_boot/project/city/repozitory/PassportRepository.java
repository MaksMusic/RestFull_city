package com.maksud.spring_boot.project.city.repozitory;

import com.maksud.spring_boot.project.city.model.Passport;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PassportRepository extends JpaRepository<Passport,Long> {

}
