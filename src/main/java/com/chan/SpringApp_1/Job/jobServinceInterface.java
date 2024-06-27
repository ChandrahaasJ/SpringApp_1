package com.chan.SpringApp_1.Job;
import java.util.List;

public interface jobServinceInterface {
    public List<Job> findAll();
    public String CreateJob(Job job);
    public List<Job> getjobByID(String id);
}
