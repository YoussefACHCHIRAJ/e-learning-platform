import { Component } from '@angular/core';
import { StepperService } from '../../../../shared/service/stepper.service';
import { Router } from '@angular/router';
import {FormsModule} from "@angular/forms";
import { PathService } from '../../../../shared/service/learn/path.service';
import { Path } from '../../../../shared/model/learn/path.model';
@Component({
  selector: 'app-create-course',
  standalone: true,
  imports: [FormsModule
  ],
  templateUrl: './create-course.component.html',
  styleUrl: './create-course.component.css'
})
export class CreateCourseComponent {
  constructor(private stepperService: StepperService, private router: Router, private pathService: PathService) {}

  incrementStepper() {
    this.stepperService.stepperCounter = 2;
    this.router.navigate(['paths/create/section-info'])
  }
  descrementStepper() {
    this.stepperService.stepperCounter = 0;
    this.router.navigate(['paths/create/path-info'])
  }

  get path(): Path {
    return this.pathService.item;
  }

  set path(value: Path) {
    this.pathService.item = value;
  }
  courseNumbers(): number[]{
    const array = new Array(this.path.courseNumbers);
    return array.map((_, index) => ++index);
  }
}
