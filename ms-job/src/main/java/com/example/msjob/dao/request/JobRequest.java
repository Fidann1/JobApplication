package com.example.msjob.dao.request;

import com.example.msjob.enums.ExperienceLevel;
import com.example.msjob.enums.JobStatus;
import com.example.msjob.enums.JobType;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Builder
@Getter
public class JobRequest {
    private String title;
    private String description;
    private String location;
    private Long salary;
    private JobType type;
    private LocalDate applicationDeadline;
    private ExperienceLevel experienceLevel;
    private JobStatus status;
    private Double minSalary;
    private Double maxSalary;
    private List<Long> skillIds;
}
