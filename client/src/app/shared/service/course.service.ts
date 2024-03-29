import { Injectable } from '@angular/core';

import { HttpClient } from '@angular/common/http';
import { Course } from '../model/course.model';

@Injectable({
  providedIn: 'root'
})
 

export class CourseService {
private course :Course;
private courses :Array<Course>;
constructor(private http :HttpClient) { }
    public getCourse(): :Course {
        return this.course;
    }

    public setCourse(course: :Course): void {
        this.course = course;
    }

    public getCourses(): :Array<Course> {
        return this.courses;
    }

    public setCourses(courses: :Array<Course>): void {
        this.courses = courses;
    }


  
  
}
