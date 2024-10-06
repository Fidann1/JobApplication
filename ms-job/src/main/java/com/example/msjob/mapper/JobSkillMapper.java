package com.example.msjob.mapper;

import com.example.msjob.entity.JobEntity;
import com.example.msjob.entity.JobSkillEntity;

import java.util.ArrayList;
import java.util.List;

public enum JobSkillMapper {
    JOB_SKILL_MAPPER;

    public List<JobSkillEntity> mapToEntity(List<Long> skillIds, Long jobId){
        List<JobSkillEntity> jobSkillEntities = new ArrayList<>();

        for (Long skillId : skillIds) {
            jobSkillEntities.add(JobSkillEntity.builder()
                    .jobId(jobId)
                    .skillId(skillId)
                    .build());
        }

        return jobSkillEntities;



    }
}
