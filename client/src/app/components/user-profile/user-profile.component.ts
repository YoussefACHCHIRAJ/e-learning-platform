import { Component } from '@angular/core';
import { auth } from '../../utils/functions';

@Component({
  selector: 'app-user-profile',
  standalone: true,
  imports: [],
  templateUrl: './user-profile.component.html',
  styleUrl: './user-profile.component.css'
})
export class UserProfileComponent {
  private _authUser = auth()?.user;
  public get authUser() {
    return this._authUser;
  }
  public set authUser(value) {
    this._authUser = value;
  }
}
