import { Component, OnInit } from '@angular/core';
import { StepperService } from '../../../../shared/service/stepper.service';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { PathService } from '../../../../shared/service/learn/path.service';
import { Path } from '../../../../shared/model/learn/path.model';
import { PathStatusService } from '../../../../shared/service/learn/path-status.service';
import { PathStatus } from '../../../../shared/model/learn/path-status.model';
@Component({
  selector: 'app-create-paths',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './create-paths.component.html',
  styleUrl: './create-paths.component.css',
})
export class CreatePathsComponent implements OnInit {
  constructor(
    private stepperService: StepperService,
    private router: Router,
    private service: PathService,
    private pathStatusService: PathStatusService
  ) {}
  ngOnInit(): void {
    this.findAll();
  }


  findAll(){
    return this.pathStatusService.findAll().subscribe(data => {
      this.pathStatuses = data;
    });
  }

  public save(): void {
    // this.service.save().subscribe((data: number) => {
    //   if (data > 0) {
    //     alert('OK');
    //   } else {
    //     alert('Error');
    //   }
    // });
    console.log(this.service.path);
    this.incrementStepper();
    
  }

  get path(): Path {
    return this.service.path;
  }

  set path(value: Path) {
    this.service.path = value;
  }

  get paths(): Array<Path> {
    return this.service.paths;
  }

  set items(value: Array<Path>) {
    this.service.paths = value;
  }

  incrementStepper() {
    this.stepperService.stepperCounter = 1;
    this.router.navigate(['paths/create/cours-info']);
  }
  public get pathStatuses(): Array<PathStatus> {
    return this.pathStatusService.pathStatuses;
  }
  public set pathStatuses(value: Array<PathStatus>) {
    this.pathStatusService.pathStatuses = value;
  }
}
