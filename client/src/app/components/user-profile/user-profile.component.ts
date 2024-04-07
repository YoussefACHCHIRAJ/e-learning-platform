import { Component } from '@angular/core';
import { auth } from '../../utils/functions';
import { AvatarService } from '../../shared/service/avatar.service';

@Component({
  selector: 'app-user-profile',
  standalone: true,
  imports: [],
  templateUrl: './user-profile.component.html',
  styleUrl: './user-profile.component.css'
})
export class UserProfileComponent {
  private _authUser = auth()?.user;
 
 
  constructor(private avatarService: AvatarService){}

  public get avatarUrl(): string {
    return this.avatarService.avatarUrl;
  }

  public get authUser() {
    return this._authUser;
  }
  public set authUser(value) {
    this._authUser = value;
  }
}
