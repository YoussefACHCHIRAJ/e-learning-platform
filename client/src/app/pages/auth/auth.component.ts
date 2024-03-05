import { Component } from '@angular/core';
import { LoginComponent } from "../../components/login/login.component";
import { CommonModule } from '@angular/common';
import { RegisterComponent } from "../../components/register/register.component";

@Component({
    selector: 'app-auth',
    standalone: true,
    templateUrl: './auth.component.html',
    styleUrl: './auth.component.css',
    imports: [CommonModule, LoginComponent, RegisterComponent]
})
export class AuthComponent {
  private _isLoginActive = true;

  public get isLoginActive() {
    return this._isLoginActive;
  }
  
  public set isLoginActive(value) {
    this._isLoginActive = value;
  }

  handleToggleLoginActive(){
    this.isLoginActive = !this.isLoginActive;
    console.log("handle toggle has been clicked")
  }
}
