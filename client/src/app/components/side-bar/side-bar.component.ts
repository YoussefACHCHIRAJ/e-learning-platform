import { CommonModule } from '@angular/common';

import { Component, Input, OnInit, ViewEncapsulation } from '@angular/core';
import { NavigationEnd, Router } from '@angular/router';
import { filter } from 'rxjs';
import { navigationButtonsValues } from '../../../constants';

interface NavigationButtons {
  icon: string;
  content: string;
  path: string;
  isActive: boolean;
}

@Component({
  selector: 'app-side-bar',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './side-bar.component.html',
  styleUrl: './side-bar.component.css',
  encapsulation: ViewEncapsulation.None,
})
export class SideBarComponent implements OnInit {
  private _navigationButtons!: Array<NavigationButtons>;

  constructor(private router: Router) {}

  ngOnInit(): void {
    this.navigationButtons = navigationButtonsValues;

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

  navigateTo(path: string) {
    this.router.navigate([path]);
  }

  getCurrentRoute() {
    return this.router.url;
  }

  updateNavigationButton() {
    this.navigationButtons.forEach(navigateButton => navigateButton.isActive = `/${navigateButton?.path}` === this.getCurrentRoute());
  }
}
