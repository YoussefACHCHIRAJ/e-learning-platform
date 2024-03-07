import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {SideBarComponent} from "./components/side-bar/side-bar.component";
import {CalendarComponent} from "./components/calendar/calendar.component";
import {UserProfileComponent} from "./components/user-profile/user-profile.component";

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
  imports: [RouterOutlet, SideBarComponent, CalendarComponent, UserProfileComponent]
})

export class AppComponent {
  title = 'e-learning';
}
