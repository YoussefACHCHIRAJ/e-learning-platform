import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { SideBarComponent } from '../../components/side-bar/side-bar.component';
import { HeaderComponent } from '../header/header.component';
import { CommonModule } from '@angular/common';
import {LetsStartComponent} from "../../components/lets-start/lets-start.component";

@Component({
  selector: 'app-start-layout',
  standalone: true,
  imports: [RouterOutlet, CommonModule, SideBarComponent, HeaderComponent, LetsStartComponent],
  templateUrl: './start-layout.component.html',
  styleUrl: './start-layout.component.css'
})
export class StartLayoutComponent {
  private _isSideActive = false;


  public get isSideActive() {
    return this._isSideActive;
  }
  public set isSideActive(value) {
    this._isSideActive = value;
  }
}
