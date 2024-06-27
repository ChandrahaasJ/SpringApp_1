package com.chan.SpringApp_1.Job;

import org.springframework.web.bind.annotation.RestController;

import com.chan.SpringApp_1.Job.implementation.JobServiceImplementation;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class jobcontroller {
    private JobServiceImplementation impl;

    public jobcontroller(JobServiceImplementation impl){
        this.impl=impl;
    }
    @GetMapping("/hello")
    public List<Job> Hello(){
        return impl.findAll();
    }

    @PostMapping("/hello")
    public String postHello(@RequestBody String jobname) {
        return "hello"+ jobname +"!";
    }

    @PostMapping("/jobs")
    public String postMethodName(@RequestBody Job body) {    
        //Job s=new Job(js., 0, 0)
        return impl.CreateJob(body);
    }
    
    
    
}
