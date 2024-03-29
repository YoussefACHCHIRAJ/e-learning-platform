import { Component } from '@angular/core';
import {Router, RouterLink} from "@angular/router";

@Component({
  selector: 'app-dashboard-box',
  standalone: true,
  imports: [RouterLink],
  templateUrl: './dashboard-box.component.html',
  styleUrl: './dashboard-box.component.css'
})
export class DashboardBoxComponent {

  constructor(private router: Router) { }

  navigateToStartPage() {
    this.router.navigate(['start']);
  }
}
