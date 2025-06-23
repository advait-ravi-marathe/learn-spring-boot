package com.in28minutes.learn_spring_boot;

public class Course {
    private long id;
    private String courseName;
    private String courseInstructor;

    public Course(int id, String courseName, String courseInstructor) {
        this.id = id;
        this.courseName = courseName;
        this.courseInstructor = courseInstructor;
    }

    public long getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseInstructor() {
        return courseInstructor;
    }

    @Override
    public String toString() {
        return "Course {" +
                "\tID = " + id +
                ",\n\tCourse Name = " + courseName +
                ",\n\tCourse Instructor = " + courseInstructor +
                '}';
    }
}
