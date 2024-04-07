import { Component } from '@angular/core';
import { RouterLink } from '@angular/router';
import { isAdmin } from '../../../utils/functions';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-paths',
  standalone: true,
  imports: [RouterLink, CommonModule],
  templateUrl: './paths.component.html',
  styleUrl: './paths.component.css'
})
export class PathsComponent {
  
  private _isAdmin: boolean = isAdmin();
  
  public get isAdmin(): boolean {
    return this._isAdmin;
  }
  public set isAdmin(value: boolean) {
    this._isAdmin = value;
  }
}
