import { Injectable } from '@angular/core';
import { getAvatar } from '../../utils/functions';

@Injectable({
  providedIn: 'root',
})
export class AvatarService {
  private _avatarUrl!: string;

  constructor() {
    this.avatarUrl = getAvatar();
  }

  public get avatarUrl(): string {
    return this._avatarUrl;
  }
  public set avatarUrl(value: string) {
    this._avatarUrl = value;
  }
}
