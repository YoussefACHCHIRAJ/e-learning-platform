import { Injectable } from '@angular/core';
import { PathStatus } from '../../model/learn/path-status.model';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { token } from '../../../utils/functions';

@Injectable({
  providedIn: 'root'
})
export class PathStatusService {
  private _pathStatus!: PathStatus;
  private _pathStatuses!: Array<PathStatus>;
  private _url = "http://localhost:8090/api/pathStatus/";
  private headers!: HttpHeaders;
  
  
  constructor(private http:HttpClient) {
    this.headers = new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': `Bearer ${token()}`,
    });
   }


  findAll():Observable<PathStatus[]>{
    return this.http.get<PathStatus[]>(this.url, { headers: this.headers });
  }



  public get pathStatuses(): Array<PathStatus> {
    return this._pathStatuses;
  }
  public set pathStatuses(value: Array<PathStatus>) {
    this._pathStatuses = value;
  }
  public get pathStatus(): PathStatus {
    return this._pathStatus;
  }
  public set pathStatus(value: PathStatus) {
    this._pathStatus = value;
  }
  public get url() {
    return this._url;
  }
  public set url(value) {
    this._url = value;
  }

}
