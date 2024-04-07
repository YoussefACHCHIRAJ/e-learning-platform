import { Injectable } from '@angular/core';
import { auth } from '../../utils/functions';

@Injectable({
  providedIn: 'root'
})
export class HeaderService {
  private _headerTitle = `Welcome back ${auth().user.firstname}`;
  
  constructor() { }
  public get headerTitle(): string {
    return this._headerTitle;
  }
  public set headerTitle(value: string) {
    this._headerTitle = value;
  }


}
