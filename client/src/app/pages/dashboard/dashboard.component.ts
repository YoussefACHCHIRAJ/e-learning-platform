import { Component } from '@angular/core';
import { DashboardBoxComponent } from '../../components/dashboard-box/dashboard-box.component';
import { TaglineComponent } from '../../components/tagline/tagline.component';

@Component({
    selector: 'app-dashboard',
    standalone: true,
    templateUrl: './dashboard.component.html',
    styleUrl: './dashboard.component.css',
    imports: [DashboardBoxComponent, TaglineComponent]
})
export class DashboardComponent {

}
