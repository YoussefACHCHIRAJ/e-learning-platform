import { Component, OnInit } from '@angular/core';
import { AdminService } from '../../shared/service/admin/admin.service';
import { User } from '../../shared/model/user.model';

@Component({
  selector: 'app-prof-card',
  standalone: true,
  imports: [],
  templateUrl: './prof-card.component.html',
  styleUrl: './prof-card.component.css'
})
export class ProfCardComponent implements OnInit {

  users: User[] = [];
  students: User[] = [];
  profs: User[] = [];

  constructor(private adminService: AdminService) {
  }

  ngOnInit(): void {
    this.findAllUsers();
  }

  public findAllUsers() {
    this.adminService.findAllUsers().subscribe(users => {
      this.users = users;
      this.profs = users.filter(user => user.role === 'Prof');
    });

  }
}
