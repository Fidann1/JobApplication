package com.example.msjob.service;

import com.example.msjob.model.Job;
import com.example.msjob.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    // Method to get all jobs from the database
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    // Method to create a new job and save it in the database
    public Job createJob(Job job) {
        return jobRepository.save(job);
    }
}
