import { Injectable } from '@angular/core';
import { JwtService } from './jwt.service';

@Injectable({
  providedIn: 'root'
})
export class HeaderService {
  private _headerTitle!: string;

  constructor(private jwtService: JwtService) {
    this._headerTitle = `Welcome back ${jwtService.extractAuthUser()?.firstname!}`;
  }
  public get headerTitle(): string {
    return this._headerTitle;
  }
  public set headerTitle(value: string) {
    this._headerTitle = value;
  }


}
