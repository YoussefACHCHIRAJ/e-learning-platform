import { Component } from '@angular/core';
import { StepperService } from '../../shared/service/stepper.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-stepper',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './stepper.component.html',
  styleUrl: './stepper.component.css'
})
export class StepperComponent {

  constructor(private stepperService: StepperService){}

  get stepperCounter() {
    return this.stepperService.stepperCounter;
  }
}
