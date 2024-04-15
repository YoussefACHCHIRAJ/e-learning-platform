import { CommonModule } from '@angular/common';

import { Component, OnInit, ViewEncapsulation } from '@angular/core';
import { NavigationEnd, Router, RouterLink } from '@angular/router';
import { filter } from 'rxjs';
import { navigationButtonsValues } from '../../../constants';
import { HeaderService } from '../../shared/service/header.service';
import { JwtService } from '../../shared/service/jwt.service';

interface NavigationButtons {
  icon: string;
  content: string;
  path: string;
  isActive: boolean;
  title: string
}

@Component({
  selector: 'app-side-bar',
  standalone: true,
  imports: [CommonModule, RouterLink],
  templateUrl: './side-bar.component.html',
  styleUrl: './side-bar.component.css',
  encapsulation: ViewEncapsulation.None,
})
export class SideBarComponent implements OnInit {
  private _navigationButtons!: Array<NavigationButtons>;

  constructor(private router: Router, private headerService: HeaderService, private jwtService: JwtService) {}

  ngOnInit(): void {
    this.navigationButtons = navigationButtonsValues.filter(nav => nav.authorities?.some(role => role === this.jwtService.extractRole()));

    this.router.events
      .pipe(filter((event) => event instanceof NavigationEnd))
      .subscribe(() => this?.updateNavigationButton());
  }

  public get navigationButtons(): Array<NavigationButtons> {
    return this._navigationButtons;
  }
  public set navigationButtons(value: Array<NavigationButtons>) {
    this._navigationButtons = value;
  }

  navigateTo(path: string, title: string = `Welcome back ${this.jwtService.extractAuthUser().firstname}`) {
    this.router.navigate([path]);
    this.headerService.headerTitle = title;
  }

  getCurrentRoute() {
    return this.router.url;
  }

  updateNavigationButton() {
    this.navigationButtons.forEach(navigateButton => navigateButton.isActive = `/${navigateButton?.path}` === this.getCurrentRoute());
  }

  logout(){
    localStorage.removeItem('token');
    this.router.navigate([""]);
  }
}
