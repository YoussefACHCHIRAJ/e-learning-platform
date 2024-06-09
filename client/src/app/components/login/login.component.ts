import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { LoginService } from '../../shared/service/login.service';
import { Router } from '@angular/router';
import { JwtService } from '../../shared/service/jwt.service';
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

  constructor(private loginService: LoginService, private router: Router, private jwtService: JwtService){}

  public get user(){
    return this.loginService?.user;
  }

  public get error(){
    return this.loginService.error;
  }

  public login(){
    this.loginService.login()
      .subscribe(data => {
        
        if(data?.statusCode === 403){
            this.loginService.error = data?.message; 
            return;      
        }
        this.jwtService.saveToken(data.token!);
        this.router.navigate(["/dashboard"]);
      });
    
  }

}
