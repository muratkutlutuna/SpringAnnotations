package com.tpe.app;

import com.tpe.AppConfiguration;
import com.tpe.domain.Course;
import com.tpe.service.CourseService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        Course course = new Course();
        course.setName("SQL");

        CourseService service = context.getBean("zoomService", CourseService.class);
        service.teachCourse(course);
        service.saveCourse(course);

        System.out.println("--------------------------------");
        String[] beanNames = context.getBeanDefinitionNames();
        for (String bean : beanNames) {
            System.out.println("Bean name = " + bean);
        }

        //we didn't create a new zoomService by writing "new", we just asked for it!
        //we also didn't create a new repository for our service. It also come along with it :)

    }
}
