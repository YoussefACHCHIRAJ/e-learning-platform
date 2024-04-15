import { Component } from '@angular/core';
import { AvatarService } from '../../shared/service/avatar.service';
import { JwtService } from '../../shared/service/jwt.service';
import { User } from '../../shared/model/user.model';

@Component({
  selector: 'app-user-profile',
  standalone: true,
  imports: [],
  templateUrl: './user-profile.component.html',
  styleUrl: './user-profile.component.css'
})
export class UserProfileComponent {
  private _authUser!: User;
 
 
  constructor(private avatarService: AvatarService, private jwtService: JwtService){
    this._authUser = jwtService.extractAuthUser()
  }

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
