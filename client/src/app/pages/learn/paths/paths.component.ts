import { Component } from '@angular/core';
import { RouterLink } from '@angular/router';
import { CommonModule } from '@angular/common';
import { JwtService } from '../../../shared/service/jwt.service';

@Component({
  selector: 'app-paths',
  standalone: true,
  imports: [RouterLink, CommonModule],
  templateUrl: './paths.component.html',
  styleUrl: './paths.component.css'
})
export class PathsComponent {
  
  private _isAdmin!: boolean;
  constructor ( private jwtSerice: JwtService) {
    this._isAdmin = this.jwtSerice.isAdmin()
  }
  
  public get isAdmin(): boolean {
    return this._isAdmin;
  }
  public set isAdmin(value: boolean) {
    this._isAdmin = value;
  }
}
