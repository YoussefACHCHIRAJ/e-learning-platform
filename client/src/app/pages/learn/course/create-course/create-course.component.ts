import { Component, OnInit } from '@angular/core';
import { StepperService } from '../../../../shared/service/stepper.service';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { PathService } from '../../../../shared/service/learn/path.service';
import { Path } from '../../../../shared/model/learn/path.model';
import { CourseService } from '../../../../shared/service/learn/course.service';
import { Course } from '../../../../shared/model/learn/course.model';
@Component({
  selector: 'app-create-course',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './create-course.component.html',
  styleUrl: './create-course.component.css',
})
export class CreateCourseComponent implements OnInit {
  private _coursesNumbersArray: number[] = [];

  constructor(
    private stepperService: StepperService,
    private router: Router,
    private pathService: PathService,
    private courseService: CourseService
  ) {}

  ngOnInit() {
    this.courseNumbers();
  }

  incrementStepper() {
    this.stepperService.stepperCounter = 2;
    this.extractCoursesInfo();
    this.router.navigate(['paths/create/section-info']);
  }
  descrementStepper() {
    this.stepperService.stepperCounter = 0;
    this.router.navigate(['paths/create/path-info']);
  }

  get path(): Path {
    return this.pathService.path;
  }

  set path(value: Path) {
    this.pathService.path = value;
  }

  public set course(course: Course) {
    this.courseService.course = course;
  }
  public set courses(courses: Array<Course>) {
    this.courseService.courses = courses;
  }

  public get course(): Course {
    return this.courseService.course;
  }
  public get courses(): Course[] {
    return this.courseService.courses;
  }

  public get coursesNumbersArray() {
    return this._coursesNumbersArray;
  }
  public set coursesNumbersArray(value: number[]) {
    this._coursesNumbersArray = value;
  }

  courseNumbers() {
    this.coursesNumbersArray = Array.from(
      { length: this.path?.courseNumbers! | 0 },
      (_, index) => index + 1
    );
  }

  extractCoursesInfo() {
    for (const course of this._coursesNumbersArray) {
      const courseName = document.getElementById(
        `course-${course}-name`
      ) as HTMLInputElement;
      const coursedesc = document.getElementById(
        `course-${course}-desc`
      ) as HTMLInputElement;
      const sectionsNumbers = document.getElementById(
        `course-${course}-sectionsNumber`
      ) as HTMLInputElement;

      this.course = {
        label: courseName.value,
        code: courseName.value.toLowerCase(),
        description: coursedesc.value,
        path: this.path,
        sectionsNumbers: parseInt(sectionsNumbers.value),
      };

      this.courses = !!this.courses
        ? [...this.courses, this.course]
        : [this.course];
    }

    console.log({ courses: this.courses });
  }
}
