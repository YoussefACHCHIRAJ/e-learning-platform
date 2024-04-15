import { Component } from '@angular/core';
import { ProfCardComponent } from '../../components/prof-card/prof-card.component';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-profs',
  standalone: true,
  imports: [ProfCardComponent, CommonModule],
  templateUrl: './profs.component.html',
  styleUrl: './profs.component.css',
})
export class ProfsComponent {}
