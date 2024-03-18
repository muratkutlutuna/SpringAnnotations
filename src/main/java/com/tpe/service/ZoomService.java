package com.tpe.service;

import com.tpe.domain.Course;
import com.tpe.repository.Repository;
import com.tpe.thirdparty.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype") //prototype mostly used in multithread projects
public class ZoomService implements CourseService{

    private Repository repository;
    @Autowired
    public ZoomService(@Qualifier("localrepo")Repository repository){
        this.repository = repository;
    }

    //field injections
    @Autowired
    private InstructorService instructorService;

    @Value("${app.code}")
    String code;

    @Value("${instructor.name}")
    String instructorName;

    @Override
    public void teachCourse(Course course) {
        System.out.println(code+"-"+course.getName()+" course is being taught with zoom...");
        instructorService.teach(course.getName(),instructorName);
    }

    @Override
    public void saveCourse(Course course) {
        repository.save(course);
    }
}
