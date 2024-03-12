import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class StepperService {

  private _stepperCounter : 0 | 1 | 2 = 0;
  
  constructor() { }


  public get stepperCounter() {
    return this._stepperCounter;
  }
  public set stepperCounter(value) {
    this._stepperCounter = value;
  }
}
