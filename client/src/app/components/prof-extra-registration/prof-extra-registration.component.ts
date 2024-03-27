import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-prof-extra-registration',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './prof-extra-registration.component.html',
<<<<<<< HEAD
  styleUrl: './prof-extra-registration.component.css'
})
export class ProfExtraRegistrationComponent { 
=======

  styleUrl: './prof-extra-registration.component.css',
})
export class ProfExtraRegistrationComponent {

>>>>>>> cf7c6d5f402b64d8dde82cc16bda0733a6ef4c01
  selectedDays: string[] = [];

  toggleAvailability(event: Event, day: string) {
    const target = event.target as HTMLInputElement;
    if (target.checked) {
      this.selectedDays.push(day);
    } else {
<<<<<<< HEAD
      this.selectedDays = this.selectedDays.filter(d => d !== day);
    }
    console.log(this.selectedDays); // Just for debugging
  }

=======

      this.selectedDays = this.selectedDays.filter((d) => d !== day);
    }
  }
>>>>>>> cf7c6d5f402b64d8dde82cc16bda0733a6ef4c01
}
