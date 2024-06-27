package com.chan.SpringApp_1.Job.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.chan.SpringApp_1.Job.Job;
import com.chan.SpringApp_1.Job.jobServinceInterface;


@Service
public class JobServiceImplementation implements jobServinceInterface{
    public List<Job> jobs=new ArrayList<>();


    @Override
    public List<Job> findAll() {
        return jobs;
    }

    @Override
    public String CreateJob(Job job) {
        jobs.add(job);
        return "added successfully";
    }

    @Override
    public List<Job> getjobByID(String id){
        List<Job> occup=new ArrayList<>();
        for(Job n:jobs){
            if(n.getJobname().equals(id)){
                occup.add(n);
            }
        }
        return occup;
    }
}
