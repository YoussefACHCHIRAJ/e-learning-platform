import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Path } from '../../model/learn/path.model';
import { Observable } from 'rxjs';
import { token } from '../../../utils/functions';
import { RequestBodyInterface } from '../../../types';

@Injectable({
  providedIn: 'root'
})
export class PathService {
  public _path:Path | undefined ;
  public _paths:Array<Path> | undefined ;
  private url = 'http://localhost:8090/api/path/';
  private _requestBody!: RequestBodyInterface;
  
  private headers: HttpHeaders;
  
  constructor(private http: HttpClient) {
    this.headers = new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': `Bearer ${token()}`,
    });
  }
  
  public save(): Observable<number> {
    return this.http.post<number>(this.url, this.requestBody, { headers: this.headers });
  }

  get path(): Path {
      if (this._path == null) {
        this._path = new Path;
      }
      return this._path;
    }

    set path (value: Path) {
        this._path = value;
    }

    get paths(): Array<Path> {
      if (this._paths == null) {
        this._paths = new Array<Path>();
      }
      return this._paths;
    }

    set paths(values: Array<Path>){
        this._paths = values;
    }

    public get requestBody(): RequestBodyInterface {
      return this._requestBody;
    }
    public set requestBody(value: RequestBodyInterface) {
      this._requestBody = value;
    }
  
}
