import { Injectable } from '@angular/core';

import { HttpClient } from '@angular/common/http';
import { Path } from '../../controller/model/path.model';

@Injectable({
  providedIn: 'root'
})
export class PathService {
  private path:Path;
  private paths:Array<Path>;

  constructor(private http:HttpClient) { }
}
