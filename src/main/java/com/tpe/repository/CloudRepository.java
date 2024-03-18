package com.tpe.repository;

import com.tpe.domain.Course;
import org.springframework.stereotype.Component;

@Component("cloudrepo")
public class CloudRepository implements Repository{
    @Override
    public void save(Course course) {
        System.out.println("Course: "+course.getName()+" is being uploaaded to the cloud...");

    }
}
