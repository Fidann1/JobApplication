package com.example.msevent.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@Entity
@RequiredArgsConstructor
@Builder
@Table(name="users")

public class UserEntity {
    @Id
    @SequenceGenerator(name = "user_id", sequenceName = "user_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id")
    private Integer id;

    private String username;
    private String password;
    private Integer age;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_events",
            joinColumns=@JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "event_id")
    )
    private List<EventEntity> events;





}
