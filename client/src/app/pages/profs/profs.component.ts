import { Component } from '@angular/core';
import { ProfCardComponent } from '../../components/prof-card/prof-card.component';

@Component({
  selector: 'app-profs',
  standalone: true,
  imports: [ProfCardComponent],
  templateUrl: './profs.component.html',
  styleUrl: './profs.component.css',
})
export class ProfsComponent {}
