import { Component } from '@angular/core';
import { StepperService } from '../../../controller/service/stepper.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-section',
  standalone: true,
  imports: [],
  templateUrl: './create-section.component.html',
  styleUrl: './create-section.component.css'
})
export class CreateSectionComponent {
  constructor(private stepperService: StepperService, private router: Router) {}

  incrementStepper() {
    this.stepperService.stepperCounter = 3;
  }
  descrementStepper() {
    this.stepperService.stepperCounter = 1;
    this.router.navigate(['paths/create/cours-info'])
  }
}
