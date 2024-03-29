import { Component, OnInit } from '@angular/core';
import { StepperService } from '../../../../shared/service/stepper.service';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { PathService } from '../../../../shared/service/path.service';
import { Path } from '../../../../shared/model/path.model';
@Component({
  selector: 'app-create-paths',
  standalone: true,
  imports: [FormsModule
  ],
  templateUrl: './create-paths.component.html',
  styleUrl: './create-paths.component.css',
})
export class CreatePathsComponent  implements OnInit{
  constructor(private stepperService: StepperService, private router: Router,private service:PathService) {}
  ngOnInit(): void {
   
  } 

  public save(): void {
    this.service.save().subscribe((data: number) => {
      if (data > 0) {
        alert("OK");
      } else {
        alert("Error");
      }
    });
  }


  get item(): Path {
    return this.service.item;
  }

  set item(value: Path) {
    this.service.item = value;
  }

  get items(): Array<Path> {
    return this.service.items;
  }

  set items(value: Array<Path>) {
    this.service.items = value;
  }

  incrementStepper() {
    this.stepperService.stepperCounter = 1;
    this.router.navigate(['paths/create/cours-info'])
  }
}
