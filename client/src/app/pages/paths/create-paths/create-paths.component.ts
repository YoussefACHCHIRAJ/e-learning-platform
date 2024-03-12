import { Component } from '@angular/core';
import { StepperService } from '../../../controller/service/stepper.service';

@Component({
  selector: 'app-create-paths',
  standalone: true,
  imports: [],
  templateUrl: './create-paths.component.html',
  styleUrl: './create-paths.component.css',
})
export class CreatePathsComponent {
  constructor(private stepperService: StepperService) {}

  incrementStepper() {
    this.stepperService.stepperCounter += 1;
  }
}
