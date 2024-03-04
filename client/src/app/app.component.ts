import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { LoginComponent } from './components/auth/login/login.component';
import { SideBarComponent } from './components/side-bar/side-bar.component';

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    imports: [RouterOutlet, LoginComponent, SideBarComponent]
})

export class AppComponent {
  title = 'e-learning';
}
