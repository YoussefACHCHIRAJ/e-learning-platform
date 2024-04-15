import { Injectable } from '@angular/core';
import { getAvatar } from '../../utils/functions';
import { JwtService } from './jwt.service';

@Injectable({
  providedIn: 'root',
})
export class AvatarService {
  private _avatarUrl!: string;

  constructor(private jwtService: JwtService) {
    this.avatarUrl = getAvatar(jwtService.extractAuthUser().email!);
  }

  public get avatarUrl(): string {
    return this._avatarUrl;
  }
  public set avatarUrl(value: string) {
    this._avatarUrl = value;
  }
}
