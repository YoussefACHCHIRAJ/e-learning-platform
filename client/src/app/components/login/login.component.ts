import { Component } from '@angular/core';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {

    mainPanelActive = false;

    onSignUpClick() {
      this.mainPanelActive = true;
    }

    onSignInClick() {
      this.mainPanelActive = false;
    }
  }


