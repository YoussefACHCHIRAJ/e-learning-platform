import { Component } from '@angular/core';
import {StudentRegisterFormComponent} from "../../components/student-register-form/student-register-form.component";

@Component({
  selector: 'app-student-register',
  standalone: true,
  imports: [StudentRegisterFormComponent],
  templateUrl: './student-register.component.html',
  styleUrl: './student-register.component.css'
})
export class StudentRegisterComponent {

}
