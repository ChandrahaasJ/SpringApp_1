package com.chan.SpringApp_1.Job.implementation;

import java.util.ArrayList;
import java.util.List;

import com.chan.SpringApp_1.Job.Job;
import com.chan.SpringApp_1.Job.jobServinceInterface;

public class testImpl implements jobServinceInterface {
    List<Job> jobs=new ArrayList<>();
    @Override
    public List<Job> findAll() {
        return jobs.add("name");
    }
}
