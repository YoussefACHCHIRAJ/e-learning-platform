import { Component } from '@angular/core';
import { DashboardBoxComponent } from '../../components/dashboard-box/dashboard-box.component';

@Component({
    selector: 'app-dashboard',
    standalone: true,
    templateUrl: './dashboard.component.html',
    styleUrl: './dashboard.component.css',
    imports: [DashboardBoxComponent,]
})
export class DashboardComponent {

}
