import { Component } from '@angular/core';
import { StudentCardComponent } from "../../components/student-card/student-card.component";

@Component({
    selector: 'app-students',
    standalone: true,
    templateUrl: './students.component.html',
    styleUrl: './students.component.css',
    imports: [StudentCardComponent]
})
export class StudentsComponent {

}
