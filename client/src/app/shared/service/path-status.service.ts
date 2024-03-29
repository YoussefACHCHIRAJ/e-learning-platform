import { Injectable } from '@angular/core';
<<<<<<<< HEAD:client/src/app/shared/service/learn/path-status.service.ts
import { PathStatus } from '../../model/learn/path-status.model';
========

>>>>>>>> 4acae8a95e95548a7d752880d3600a892a1010b5:client/src/app/shared/service/path-status.service.ts
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
