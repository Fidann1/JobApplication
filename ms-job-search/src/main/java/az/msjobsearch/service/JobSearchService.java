package az.msjobsearch.service;

import az.msjobsearch.dao.JobResponse;
import az.msjobsearch.dao.JobSearchCriteria;

import java.util.List;

public interface JobSearchService {
    List<JobResponse> searchJobBasedOnCriteria(JobSearchCriteria jobSearchCriteria);

    List<JobResponse> searchJob(String keyword);
}
