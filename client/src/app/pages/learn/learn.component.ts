import { Component } from '@angular/core';
import { DashboardBoxComponent } from "../../components/dashboard-box/dashboard-box.component";
import { TaglineComponent } from "../../components/tagline/tagline.component";

@Component({
    selector: 'app-learn',
    standalone: true,
    templateUrl: './learn.component.html',
    styleUrl: './learn.component.css',
    imports: [DashboardBoxComponent, TaglineComponent]
})
export class LearnComponent {

}
