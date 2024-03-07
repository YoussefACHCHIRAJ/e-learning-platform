import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
<<<<<<< HEAD
import {SideBarComponent} from "./components/side-bar/side-bar.component";
import {CalendarComponent} from "./components/calendar/calendar.component";
import {UserProfileComponent} from "./components/user-profile/user-profile.component";
=======
import { LoginComponent } from './components/login/login.component';
import { SideBarComponent } from './components/side-bar/side-bar.component';
import { DashboardComponent } from "./pages/dashboard/dashboard.component";
import {ProfsComponent} from "./pages/profs/profs.component";
import { AuthComponent } from "./pages/auth/auth.component";
>>>>>>> 46a1dcaf904c50fd3e036b25bd5e3ef51c054373

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
<<<<<<< HEAD
  imports: [RouterOutlet, SideBarComponent, CalendarComponent, UserProfileComponent]
=======
    imports: [RouterOutlet, LoginComponent, SideBarComponent, DashboardComponent, ProfsComponent,AuthComponent]
>>>>>>> 46a1dcaf904c50fd3e036b25bd5e3ef51c054373
})

export class AppComponent {
  title = 'e-learning';
}
