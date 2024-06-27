package com.chan.SpringApp_1.Job;

public class Job {
    private String jobname;
    private int salary;
    private int experience_required;


    public Job(String jobname,int salary,int experience_required){
        this.jobname=jobname;
        this.salary=salary;
        this.experience_required=experience_required;
    }


    
    public String getJobname() {
        return jobname;
    }
    public void setJobname(String jobname) {
        this.jobname = jobname;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getExperience_required() {
        return experience_required;
    }
    public void setExperience_required(int experience_required) {
        this.experience_required = experience_required;
    }


    
}

