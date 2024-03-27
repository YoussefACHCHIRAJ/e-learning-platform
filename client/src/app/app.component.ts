import { Component, OnInit } from '@angular/core';
import { NavigationEnd, Router, RouterOutlet } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { SideBarComponent } from './components/side-bar/side-bar.component';
import { DashboardComponent } from './pages/dashboard/dashboard.component';
import { ProfsComponent } from './pages/profs/profs.component';
import { AuthComponent } from './pages/auth/auth.component';

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    imports: [RouterOutlet, LoginComponent, SideBarComponent, DashboardComponent, ProfsComponent,AuthComponent]
})

export class AppComponent implements OnInit {
  title = 'e-learning';

  constructor(private router: Router) {}

  ngOnInit() {
    this.router.events.subscribe(event => {
      if (event instanceof NavigationEnd) {
        window.scrollTo(0, 0); // Scroll to top on route change
      }
    });
  }
}
