import { Injectable } from '@angular/core';

import { HttpClient } from '@angular/common/http';
import { Course } from '../../controller/model/course.model';

@Injectable({
  providedIn: 'root'
})
 

export class CourseService {
private course :Course;
private courses :Array<Course>;

  constructor(private http :HttpClient) { }
  
}
