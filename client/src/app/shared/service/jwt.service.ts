import { Injectable } from '@angular/core';
import { JwtPayload, jwtDecode } from 'jwt-decode';
import { User } from '../model/user.model';
import { Roles } from '../authorization/roles';

interface JwtPayloadType extends JwtPayload {
  authUser?: User;
}

@Injectable({
  providedIn: 'root',
})
export class JwtService {
  constructor() {}

  saveToken(token: string): void {
    localStorage.setItem('token', JSON.stringify(token));
  }

  getToken(): string {
    return JSON.parse(localStorage.getItem('token')!);
  }

  extractClaims(token: string = this.getToken()): JwtPayloadType {
    return jwtDecode(token);
  }

  extractAuthUser(): User {
    return this.extractClaims()?.authUser!;
  }

  extractRole() {
    return this.extractAuthUser().role;
  }

  isAdmin(): boolean {
    return this.extractRole() === Roles.ADMIN;
  }

  isProf(): boolean {
    return this.extractRole() === Roles.PROF;
  }

  isStudent(): boolean {
    return this.extractRole() === Roles.STUDENT;
  }
}
