package com.product.userservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "skills")
public class SkillEntity {
    @Id
    @SequenceGenerator(sequenceName = "skill_id", name = "skill_id",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "skill_id")
    private Long id;
    private String name;
    private String description;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "user_profile_id")
    private UserProfile userProfile;
}
