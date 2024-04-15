import { Component, OnInit } from '@angular/core';
import { FullCalendarModule } from '@fullcalendar/angular';
import { CalendarOptions } from '@fullcalendar/core';
import interactionPlugin from '@fullcalendar/interaction';
import dayGridPlugin from '@fullcalendar/daygrid';
import timeGridPlugin from '@fullcalendar/timegrid';
import { eventList } from '../../../constants';
//import { ProfService } from '../../shared/service/prof.service';
import { Roles } from '../../shared/authorization/roles';

import { CalendarEventsType } from '../../types';
import { ProfService } from '../../shared/service/prof/prof.service';
import { AvailabilityProf } from '../../shared/model/prof/availabilityprof.model';
import { JwtService } from '../../shared/service/jwt.service';

@Component({
  selector: 'app-calendar',
  standalone: true,
  imports: [FullCalendarModule],
  templateUrl: './calendar.component.html',
  styleUrl: './calendar.component.css',
})
export class CalendarComponent implements OnInit {

  private _events: CalendarEventsType[] = [];
  
  
  constructor(private profService: ProfService, private jwtService: JwtService) {}
  
  ngOnInit(): void {
    this.findAllProfAvailabilities()
  }

  findAllProfAvailabilities() {
    if (this.jwtService.extractClaims().authUser?.role != Roles.PROF) {
      return;
    }
    return this.profService.findAllProfAvailabilities().subscribe(availabilities => {
      if(availabilities){
        this.profAvailabilities = availabilities;
        console.log({availabilities});
      }
    });
  }

  mapToFullCalendarEvents(availabilities: AvailabilityProf[]) {
    this.events = availabilities?.map(avail => ({
      title: `${avail.prof.firstname} ${avail.prof.lastname}`,
      start: avail.day.code, // Assuming you want to display events based on day
      allDay: true, // Assuming the events are all-day events
      classNames: ['bg-black']
    }));
  }

  calendarOptions: CalendarOptions = {
    initialView: 'dayGridMonth',
    plugins: [interactionPlugin, dayGridPlugin, timeGridPlugin],
    events: this.events,
    headerToolbar: {
      right: 'dayGridMonth,timeGridWeek,timeGridDay',
      center: 'title',
      left: 'prev,next today',
    },
    weekends: true,
    selectable: true,
    selectMirror: true,
    dayMaxEvents: true,
    dayHeaderClassNames: 'bg-accent-200',
    height: '100%',
    eventClassNames:
      'border border-accent-300 bg-accent-300 text-gray-600 cursor-pointer hover:bg-primary hover:text-black transition duration-500',
    nowIndicator: true,
    firstDay: 1,
    dayCellClassNames: 'bg-white',
    viewClassNames: 'bg-[#CFCAF1]',
  };


  public get profAvailabilities(): AvailabilityProf[] {
    return this.profService.profAvailabilities;
  }
  public set profAvailabilities(value: AvailabilityProf[]) {
    this.profService.profAvailabilities = value;
  }
  public get events(): CalendarEventsType[] {
    return this._events;
  }
  public set events(value : CalendarEventsType[]) {
    this._events = value;
  }
}




