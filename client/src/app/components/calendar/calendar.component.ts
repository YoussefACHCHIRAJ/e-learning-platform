import { Component } from '@angular/core';
import { FullCalendarModule } from '@fullcalendar/angular';
import { CalendarOptions } from '@fullcalendar/core';
import interactionPlugin from '@fullcalendar/interaction';
import dayGridPlugin from '@fullcalendar/daygrid';
import timeGridPlugin from '@fullcalendar/timegrid';
import { eventList } from '../../../constants';

@Component({
  selector: 'app-calendar',
  standalone: true,
  imports: [FullCalendarModule],
  templateUrl: './calendar.component.html',
  styleUrl: './calendar.component.css',
})
export class CalendarComponent {
  calendarOptions: CalendarOptions = {
    initialView: 'dayGridMonth',
    plugins: [interactionPlugin, dayGridPlugin, timeGridPlugin],
    events: eventList,
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
      'border border-accent-200 bg-accent-200 text-gray-900 cursor-pointer hover:bg-primary hover:text-red-600 transition duration-500',
    nowIndicator: true,
    firstDay: 1,
    dayCellClassNames: "bg-white",
    viewClassNames: "bg-[#CFCAF1]"
  };
}
