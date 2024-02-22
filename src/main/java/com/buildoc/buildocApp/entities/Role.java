package com.buildoc.buildocApp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "roles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRoles")
    private Long id;
    @Column(name = "name", length = 50)
    private String name;
    @Column(name = "descripcion", length = 5000)
    private String description;
}
