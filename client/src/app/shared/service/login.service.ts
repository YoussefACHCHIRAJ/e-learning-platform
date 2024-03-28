import { Injectable } from '@angular/core';
import { User } from '../model/user.model';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


interface ResponseType { 
  statusCode: number;
  token: string | null;
  message: string;
  role: string | null;
}

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  private _user!: User;
  private _url = 'http://localhost:8090/api/auth/authenticate';
  private _error: null | string = null;
   
  
  constructor(private http: HttpClient) { }
  

  login(): Observable<ResponseType>{
    return this.http.post<ResponseType>(this.url, this.user);
  }


  public get url() {
    return this._url;
  }
  public set url(value) {
    this._url = value;
  }
  public get user(): User {
    if(this._user == null){
      this._user = new User();
    }
    return this._user;
  }
  public set user(value: User) {
    this._user = value;
  }

  public get error(): null | string {
    return this._error;
  }
  public set error(value: null | string) {
    this._error = value;
  }
}
