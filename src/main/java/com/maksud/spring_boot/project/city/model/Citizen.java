package com.maksud.spring_boot.project.city.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "citizen")
public class Citizen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


   @Column(name = "name")
    private String name;

   @OneToOne (cascade = CascadeType.ALL)
   @JoinColumn(name = "passport_id",referencedColumnName = "id")
   private Passport passport;


}
