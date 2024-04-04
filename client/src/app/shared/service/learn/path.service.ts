import { Injectable } from '@angular/core';

import { HttpClient } from '@angular/common/http';
import { Path } from '../../model/learn/path.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PathService {
  public _path:Path | undefined ;
  public _paths:Array<Path> | undefined ;
  private url = '';
  
  constructor(private http:HttpClient) {}
  
  public save(): Observable<number> {
    return this.http.post<number>(this.url, this.item);
  }

  get item(): Path {
      if (this._path == null) {
        this._path = new Path;
      }
      return this._path;
    }

    set item (path: Path) {
        this._path = path;
    }

    get items(): Array<Path> {
      if (this._paths == null) {
        this._paths = new Array<Path>();
      }
      return this._paths;
    }

    set items(paths: Array<Path>){
        this._paths = paths;
    }


  
}
