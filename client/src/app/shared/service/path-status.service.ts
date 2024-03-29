import { Injectable } from '@angular/core';

import { HttpClient } from '@angular/common/http';
import { PathStatus } from '../model/path-status.model';

@Injectable({
  providedIn: 'root'
})
export class PathStatusService {
  private pathStatus:PathStatus;
  private pathStatuss:Array<PathStatus>;
  

  constructor(private http:HttpClient) { }
}
