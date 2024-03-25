import { Component } from '@angular/core';
import { StepperService } from '../../../../controller/service/stepper.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-paths',
  standalone: true,
  imports: [],
  templateUrl: './create-paths.component.html',
  styleUrl: './create-paths.component.css',
})
export class CreatePathsComponent {
  constructor(private stepperService: StepperService, private router: Router) {}

  incrementStepper() {
    this.stepperService.stepperCounter = 1;
    this.router.navigate(['paths/create/cours-info'])
  }
}
