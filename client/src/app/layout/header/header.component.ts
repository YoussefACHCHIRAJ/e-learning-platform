import { Component } from '@angular/core';
import { RouterLink } from '@angular/router';
import { HeaderService } from '../../shared/service/header.service';
import { auth } from '../../utils/functions';

@Component({
  selector: 'app-header',
  standalone: true,
  imports: [RouterLink],
  templateUrl: './header.component.html',
  styleUrl: './header.component.css'
})
export class HeaderComponent {

  private _username = `${auth()?.user?.firstname} ${auth()?.user?.lastname}`;
  
  public get username() {
    return this._username;
  }
  public set username(value) {
    this._username = value;
  }

  constructor (private headerService: HeaderService){}


  get title() {
    return this.headerService.headerTitle;
  }


}
