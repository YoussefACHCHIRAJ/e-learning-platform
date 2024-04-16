import { Component, Input, OnInit } from '@angular/core';
import { AvatarService } from '../../shared/service/avatar.service';
import { JwtService } from '../../shared/service/jwt.service';
import { User } from '../../shared/model/user.model';
import { getAvatar } from '../../utils/functions';

@Component({
  selector: 'app-prof-card',
  standalone: true,
  imports: [],
  templateUrl: './prof-card.component.html',
  styleUrl: './prof-card.component.css'
})

export class ProfCardComponent implements OnInit{
  private _avatarUrl!: string;
  @Input() profEmail!: string;
  ngOnInit(): void {
    this.avatarUrl = getAvatar(this.profEmail);
  }
  public get avatarUrl(): string {
    return this._avatarUrl;
  }
  public set avatarUrl(value: string) {
    this._avatarUrl = value;
  }
}
