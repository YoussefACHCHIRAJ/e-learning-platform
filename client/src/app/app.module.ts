import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoginComponent } from './components/auth/login/login.component';

@NgModule({
  declarations: [
    LoginComponent
  ],
  imports: [CommonModule, NgModule],
})
export class AppModule {}
