import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { LoginService } from '../../shared/service/login.service';
import { Router } from '@angular/router';
// import { User } from '../../shared/model/user.model';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css',
})
export class LoginComponent {
  
  @Input() isLoginActive!: boolean;

  constructor(private loginService: LoginService, private router: Router){}

  public get user(){
    return this.loginService.user;
  }

  public get error(){
    return this.loginService.error;
  }

  public login(){
    this.loginService.login()
      .subscribe(data => {
        console.log({data});
        
        if(data?.statusCode === 400){
            this.loginService.error = data?.message; 
            return;      
        }
        const authUser = {
          token: data?.token,
          role: data?.role,
        }
        localStorage.setItem("authUser", JSON.stringify(authUser));
        this.router.navigate(["/dashboard"]);
      });
    
  }

}
