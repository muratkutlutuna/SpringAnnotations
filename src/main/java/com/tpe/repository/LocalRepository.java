package com.tpe.repository;

import com.tpe.domain.Course;
import org.springframework.stereotype.Component;

@Component("localrepo")
public class LocalRepository implements Repository{
    @Override
    public void save(Course course) {
        System.out.println("Course: "+course.getName()+" is being uploaaded to the local...");
    }
}
