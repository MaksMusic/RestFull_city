package com.maksud.spring_boot.project.city.repozitory;

import com.maksud.spring_boot.project.city.model.Auto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Queue;


public interface AutoRepository extends JpaRepository<Auto,Long> {


    @Query(value = "select* from auto where citysen_id = :id",nativeQuery = true)
    List<Auto> getAutosByCitizenId(@Param("id") Long id);
}
