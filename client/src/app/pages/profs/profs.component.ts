import { Component } from '@angular/core';
import { ProfsModuleComponent } from '../../components/profs-module/profs-module.component';

@Component({
  selector: 'app-profs',
  standalone: true,
  imports: [ProfsModuleComponent],
  templateUrl: './profs.component.html',
  styleUrl: './profs.component.css'
})
export class ProfsComponent {

}
