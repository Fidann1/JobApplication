package com.example.msapplication.repository;

import com.example.msapplication.entity.ApplicationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository  extends JpaRepository<ApplicationEntity, Long> {
}
