import { Component, Input, OnInit } from '@angular/core';
import { AvatarService } from '../../shared/service/avatar.service';
import { JwtService } from '../../shared/service/jwt.service';
import { User } from '../../shared/model/user.model';
import { getAvatar } from '../../utils/functions';

@Component({
  selector: 'app-student-card',
  standalone: true,
  imports: [],
  templateUrl: './student-card.component.html',
  styleUrl: './student-card.component.css'
})
export class StudentCardComponent implements OnInit {
  private _avatarUrl!: string;
  @Input() studentEmail!: string;
  ngOnInit(): void {
    this.avatarUrl = getAvatar(this.studentEmail);
  }
  public get avatarUrl(): string {
    return this._avatarUrl;
  }
  public set avatarUrl(value: string) {
    this._avatarUrl = value;
  }
}
