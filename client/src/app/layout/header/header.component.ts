import { Component } from '@angular/core';
import { RouterLink } from '@angular/router';
import { HeaderService } from '../../shared/service/header.service';
import { AvatarService } from '../../shared/service/avatar.service';
import { JwtService } from '../../shared/service/jwt.service';

@Component({
  selector: 'app-header',
  standalone: true,
  imports: [RouterLink],
  templateUrl: './header.component.html',
  styleUrl: './header.component.css',
})
export class HeaderComponent {
  private _username!: string;

  constructor(
    private headerService: HeaderService,
    private avatarService: AvatarService,
    private jwtService: JwtService
  ) {
    const authUser = jwtService.extractAuthUser();
    this._username = `${authUser?.firstname} ${authUser?.lastname}`
  }

  public get avatarUrl(): string {
    return this.avatarService.avatarUrl;
  }

  public get username() {
    return this._username;
  }
  public set username(value) {
    this._username = value;
  }

  get title() {
    return this.headerService.headerTitle;
  }
}
