import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { CalendarComponent } from "./components/calendar/calendar.component";
import { SideBarComponent } from "./components/side-bar/side-bar.component";



@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    imports: [RouterOutlet, CalendarComponent, SideBarComponent]
})

export class AppComponent {
  title = 'e-learning';
  value!: string;

}
