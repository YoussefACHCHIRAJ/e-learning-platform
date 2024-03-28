import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ProfService } from '../../shared/service/prof.service';
import { Day } from '../../shared/model/day.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-prof-extra-registration',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './prof-extra-registration.component.html',

  styleUrl: './prof-extra-registration.component.css',
})
export class ProfExtraRegistrationComponent implements OnInit {
  selectedDays: string[] = [];

  constructor(private profService: ProfService, private router: Router) {}
  ngOnInit(): void {
    this.findAllDays();
  }

  public save() {
    this.profService.profAvailabltiesDetails = [];
    for (const day of this.selectedDays) {
      const startTime = (
        document.getElementById(`start-time-${day}`) as HTMLInputElement
      ).value;
      const endTime = (
        document.getElementById(`end-time-${day}`) as HTMLInputElement
      ).value;
      this.addAvailabilityDetail(day, startTime, endTime);
    }

    this.profService.requstBody = {
      profEmail: 'youssef1@gmail.com',
      profAvailabilitiesDetails: this.profService.profAvailabltiesDetails,
    };

    console.log({
      profAvailabltiesDetails: this.profService.profAvailabltiesDetails,
    });

    return this.profService
      .saveProfAvailability()
      .subscribe((data) => {
        if(data?.statusCode === 201){
          this.router.navigate(["/dashboard/calendar"])
        }
      });
  }

  addAvailabilityDetail(
    dayCode: string,
    startTimeSlot: string,
    endTimeSlot: string
  ) {
    this.profService.profAvailabltiesDetails.push({
      dayCode,
      startTimeSlot,
      endTimeSlot,
    });
  }

  public findAllDays() {
    this.profService.findAllDays().subscribe((data) => (this.days = data));
  }

  public get days() {
    return this.profService.days;
  }
  public set days(days: Day[]) {
    this.profService.days = days;
  }

  toggleAvailability(event: Event, day: string) {
    const target = event.target as HTMLInputElement;
    if (target.checked) {
      this.selectedDays.push(day);
    } else {
      this.selectedDays = this.selectedDays.filter((d) => d !== day);
    }
  }
}
