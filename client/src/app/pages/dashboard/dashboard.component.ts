import { Component } from '@angular/core';
import { SideBarComponent } from "../../components/side-bar/side-bar.component";
import { RouterOutlet } from '@angular/router';
import {DashboardBoxComponent} from "../../components/dashboard-box/dashboard-box.component";
import {TaglineComponent} from "../../components/tagline/tagline.component";

@Component({
    selector: 'app-dashboard',
    standalone: true,
    templateUrl: './dashboard.component.html',
    styleUrl: './dashboard.component.css',
  imports: [RouterOutlet, SideBarComponent, DashboardBoxComponent, TaglineComponent]
})
export class DashboardComponent {

}
