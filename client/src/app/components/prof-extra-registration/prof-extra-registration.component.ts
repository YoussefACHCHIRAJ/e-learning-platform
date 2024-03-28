import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-prof-extra-registration',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './prof-extra-registration.component.html',

  styleUrl: './prof-extra-registration.component.css',
})
export class ProfExtraRegistrationComponent {

  selectedDays: string[] = [];

  toggleAvailability(event: Event, day: string) {
    const target = event.target as HTMLInputElement;
    if (target.checked) {
      this.selectedDays.push(day);
    } else {

      this.selectedDays = this.selectedDays.filter((d) => d !== day);
    }
  }
}
