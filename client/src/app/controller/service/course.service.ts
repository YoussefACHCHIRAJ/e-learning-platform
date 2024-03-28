import { Injectable } from '@angular/core';
import { Course } from '../model/course.model';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
 

export class CourseService {
private course :Course;
private courses :Array<Course>;

  constructor(private http :HttpClient) { }
  
}
