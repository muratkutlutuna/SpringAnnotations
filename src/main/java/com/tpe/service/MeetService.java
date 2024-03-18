package com.tpe.service;

import com.tpe.domain.Course;
import com.tpe.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MeetService implements CourseService{

    private Repository repository;
    @Autowired
    public MeetService(@Qualifier("cloudrepo")Repository repository) {
        this.repository = repository;
    }

    @Override
    public void teachCourse(Course course) {
        System.out.println(course.getName()+" course is being taught with meet...");
    }

    @Override
    public void saveCourse(Course course) {
        repository.save(course);
    }
}
