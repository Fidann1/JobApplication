package com.example.msevent.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@RequiredArgsConstructor
@Builder
@Table(name="events")
public class EventEntity {
    @Id
    @SequenceGenerator(name = "role_id", sequenceName = "role_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_id")
    private Integer id;

    private String eventName;
    private LocalDateTime eventDate;
    private String description;

     @ManyToMany(mappedBy = "events")
    @JsonBackReference
    private List<UserEntity> users;



}
