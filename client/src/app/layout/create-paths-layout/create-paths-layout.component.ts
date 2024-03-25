import { Component } from '@angular/core';
import { HeaderComponent } from "../header/header.component";
import { RouterOutlet } from '@angular/router';
import { StepperComponent } from "../../components/stepper/stepper.component";

@Component({
    selector: 'app-create-paths-layout',
    standalone: true,
    templateUrl: './create-paths-layout.component.html',
    styleUrl: './create-paths-layout.component.css',
    imports: [RouterOutlet, HeaderComponent, StepperComponent]
})
export class CreatePathsLayoutComponent {

}
