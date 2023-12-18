package com.maksud.spring_boot.project.city.model;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "citizen")
public class Citizen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


   @Column(name = "name",nullable = false)
    private String name;

   @OneToOne (cascade = CascadeType.ALL,orphanRemoval = true)
   @JoinColumn(name = "passport_id",referencedColumnName = "id",nullable = true)
   private Passport passport;



   //orphanRemoval = true - при удалении юзера удаляются все его авто
   @OneToMany(mappedBy = "citysen", cascade = CascadeType.ALL,orphanRemoval = true)
   private List<Auto> autos;


    @ManyToMany
    @JoinTable(
            name = "citizen_home",
            joinColumns = @JoinColumn(name = "citizen_id"),
            inverseJoinColumns = @JoinColumn(name = "home_id")
    )
    private List<Home> homes;

}
