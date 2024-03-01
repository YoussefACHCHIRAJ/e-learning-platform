import { Component } from '@angular/core';
import { PasswordModule } from 'primeng/password';


@Component({
  selector: 'app-primeng-test',
  standalone: true,
  imports: [PasswordModule],
  templateUrl: './primeng-test.component.html',
  styleUrl: './primeng-test.component.css',
})
export class PrimengTestComponent {
  value!: string;
}
