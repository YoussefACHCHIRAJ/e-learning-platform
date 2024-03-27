import { Component } from '@angular/core';
import { GroupsCardComponent } from '../../components/groups-card/groups-card.component';
@Component({
  selector: 'app-groups',
  standalone: true,
  imports: [GroupsCardComponent],
  templateUrl: './groups.component.html',
  styleUrl: './groups.component.css'
})
export class GroupsComponent {

}
