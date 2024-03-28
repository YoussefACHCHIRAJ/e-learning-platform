import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class HeaderService {
  private _headerTitle = "Learn";
  
  constructor() { }
  public get headerTitle(): string {
    return this._headerTitle;
  }
  public set headerTitle(value: string) {
    this._headerTitle = value;
  }


}
