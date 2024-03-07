import { CommonModule } from '@angular/common';
import { Component, Input, ViewEncapsulation } from '@angular/core';
import { Router } from '@angular/router';

interface NavigationButtons {
  icon: string,
  content: string,
  path: string
}

@Component({
  selector: 'app-side-bar',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './side-bar.component.html',
  styleUrl: './side-bar.component.css',
  encapsulation: ViewEncapsulation.None
})
export class SideBarComponent {

   private _navigationButtons: Array<NavigationButtons> = [
    {
      icon: "fa-solid fa-house",
      content: "Learn",
      path: "dashboard"
    },
    {
      icon: "fas fa-user",
      content: "Profile",
      path: "dashboard/profile"

    },
    {
      icon: "fa-solid fa-users-rectangle",
      content: "Groups",
      path: "dashboard/groups"

    },
    {
      icon: "fa-solid fa-user-tie",
      content: "Profs",
      path: "dashboard/profs"

    },
    {
      icon: "fa-solid fa-user-group",
      content: "Students",
      path: "dashboard/students"

    },
    {
      icon: "fa-solid fa-calendar-days",
      content: "Calender",
      path: "dashboard/calendar"

    },
  ];


  constructor (private router:Router){}

  public get navigationButtons(): Array<NavigationButtons> {
    return this._navigationButtons;
  }
  public set navigationButtons(value: Array<NavigationButtons>) {
    this._navigationButtons = value;
  }

  navigateTo(path: string){
    this.router.navigate([path]);
  }

}