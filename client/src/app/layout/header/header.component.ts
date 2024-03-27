import { Component } from '@angular/core';
import { RouterLink } from '@angular/router';
import { HeaderService } from '../../controller/service/header.service';

@Component({
  selector: 'app-header',
  standalone: true,
  imports: [RouterLink],
  templateUrl: './header.component.html',
  styleUrl: './header.component.css'
})
export class HeaderComponent {

  constructor (private headerService: HeaderService){}


  get title() {
    return this.headerService.headerTitle;
  }
}
