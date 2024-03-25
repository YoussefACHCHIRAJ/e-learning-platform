import { Component } from '@angular/core';
import {LetsStartComponent} from "../../components/lets-start/lets-start.component";
import {RouterOutlet} from "@angular/router";
import {DashboardLayoutComponent} from "../../layout/dashboard-layout/dashboard-layout.component";

@Component({
  selector: 'app-start',
  standalone: true,
  imports: [LetsStartComponent, DashboardLayoutComponent],
  templateUrl: './start.component.html',
  styleUrl: './start.component.css'
})
export class StartComponent {

}
