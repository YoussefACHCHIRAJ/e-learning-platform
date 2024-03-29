import { Injectable } from '@angular/core';
import { PathStatus } from '../../model/learn/path-status.model';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PathStatusService {
  private pathStatus:PathStatus;
  private pathStatuss:Array<PathStatus>;
  

  constructor(private http:HttpClient) { }
}
