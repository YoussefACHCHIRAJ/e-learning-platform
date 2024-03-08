import { CommonModule } from '@angular/common';
<<<<<<< HEAD
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router, NavigationEnd } from '@angular/router';
import { filter } from 'rxjs/operators';
=======
import { Component, Input, ViewEncapsulation } from '@angular/core';
import { Router } from '@angular/router';
>>>>>>> 9fe287b2bff0a3f2e9b003f5f05d1083ca6b8459

interface NavigationButtons {
  icon: string,
  content: string,
  path: string,
  isActive: boolean
}

@Component({
  selector: 'app-side-bar',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './side-bar.component.html',
  styleUrl: './side-bar.component.css',
  encapsulation: ViewEncapsulation.None
})
export class SideBarComponent implements OnInit{

  private _currentPath!: string;

  public get currentPath(): string {
    return this._currentPath;
  }
  public set currentPath(value: string) {
    this._currentPath = value;
  }

   private _navigationButtons: Array<NavigationButtons> = [
    {
      icon: "fa-solid fa-house",
      content: "Learn",
<<<<<<< HEAD
      path: "dashboard",
      isActive: true
=======
      path: "dashboard"
>>>>>>> 9fe287b2bff0a3f2e9b003f5f05d1083ca6b8459
    },
    {
      icon: "fas fa-user",
      content: "Profile",
      path: "dashboard/profile",
      isActive:  false

    },
    {
      icon: "fa-solid fa-users-rectangle",
      content: "Groups",
      path: "dashboard/groups",
      isActive: false

    },
    {
      icon: "fa-solid fa-user-tie",
      content: "Profs",
      path: "dashboard/profs",
      isActive: false

    },
    {
      icon: "fa-solid fa-user-group",
      content: "Students",
      path: "dashboard/students",
      isActive: false

    },
    {
      icon: "fa-solid fa-calendar-days",
      content: "Calender",
      path: "dashboard/calendar",
      isActive: false

    },
  ];

  constructor (private router:Router){}
  
  ngOnInit(): void {
    this.router.events.pipe(filter(event => event instanceof NavigationEnd)).subscribe(() => {
      this.currentPath = this.getCurrentRoute();
      this.navigationButtons = this.navigationButtons.map(navigateButton => ({
        ...navigateButton,
        isActive: `/${navigateButton?.path}` === this.currentPath
      }));
      
    });
  }

  public get navigationButtons(): Array<NavigationButtons> {
    return this._navigationButtons;
  }
  public set navigationButtons(value: Array<NavigationButtons>) {
    this._navigationButtons = value;
  }

  navigateTo(path: string){
    this.router.navigate([path]);
  }

  getCurrentRoute(){
    return this.router.url;
  }

}