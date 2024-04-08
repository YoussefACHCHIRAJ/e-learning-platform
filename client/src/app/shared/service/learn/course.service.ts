import { Injectable } from '@angular/core';

import { HttpClient } from '@angular/common/http';
import { Course } from '../../model/learn/course.model';

@Injectable({
  providedIn: 'root'
})
 

export class CourseService {
private _course! :Course;
private _courses! :Array<Course>;

    constructor(private http :HttpClient) { }
    

    public get course(): Course {
        return this._course;
    }

    public set course(course: Course) {
        this._course = course;
    }

    public get courses():Array<Course> {
        return this._courses;
    }

    public set courses(courses:Array<Course>) {
        this._courses = courses;
    }


  
  
}
