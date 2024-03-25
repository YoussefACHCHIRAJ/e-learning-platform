import { Component } from '@angular/core';
import { StepperService } from '../../../../controller/service/stepper.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-course',
  standalone: true,
  imports: [],
  templateUrl: './create-course.component.html',
  styleUrl: './create-course.component.css'
})
export class CreateCourseComponent {
  constructor(private stepperService: StepperService, private router: Router) {}

  incrementStepper() {
    this.stepperService.stepperCounter = 2;
    this.router.navigate(['paths/create/section-info'])
  }
  descrementStepper() {
    this.stepperService.stepperCounter = 0;
    this.router.navigate(['paths/create/path-info'])
  }
}
