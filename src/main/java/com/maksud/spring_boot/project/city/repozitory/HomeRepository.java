package com.maksud.spring_boot.project.city.repozitory;

import com.maksud.spring_boot.project.city.model.Home;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeRepository extends JpaRepository<Home,Long> {
}
