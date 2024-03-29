import { Injectable } from '@angular/core';
import { Path } from '../../model/learn/path.model';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PathService {
  private path:Path;
  private paths:Array<Path>;

  constructor(private http:HttpClient) { }
}
