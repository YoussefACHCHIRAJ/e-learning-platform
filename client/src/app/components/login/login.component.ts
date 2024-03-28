import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { LoginService } from '../../shared/service/login.service';
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

  constructor(private loginService: LoginService){}

  public get user(){
    return this.loginService.user;
  }


  public login(){
    this.loginService.login()
      .subscribe(data => {
        console.log({data});
      });
    
    console.log({user: this.user});
  }

}
