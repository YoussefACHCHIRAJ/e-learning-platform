import { Routes } from '@angular/router';
import { DashboardComponent } from './pages/dashboard/dashboard.component';
import { AuthComponent } from './pages/auth/auth.component';
import { ProfileComponent } from './pages/profile/profile.component';
import { HomeComponent } from './pages/home/home.component';
import { NotFoundComponent } from './pages/not-found/not-found.component';
import { CalendarComponent } from './pages/calendar/calendar.component';

import { LearnComponent } from './pages/learn/learn.component';
import {ProfsComponent} from "./pages/profs/profs.component";
import { GroupsComponent } from './pages/groups/groups.component';
import { DashboardLayoutComponent } from './layout/dashboard-layout/dashboard-layout.component';
import { StudentsComponent } from './pages/students/students.component';


export const routes: Routes = [
  {
    path: '',
    title: 'Laabit Academy',
    component: HomeComponent,
  },
  {
    path: 'auth',
    title: 'Authentication',
    component: AuthComponent,
  },
  {
    path: 'dashboard',
    title: 'Dashboard',

    component: DashboardLayoutComponent,
    children: [
      {
        path: '',
        title: 'Learn',
        component: DashboardComponent,
      },
      {
        path: 'profile',
        title: 'Profile',
        component: ProfileComponent,
      },
      {
        path: 'groups',
        title: 'Groups',
        component: GroupsComponent,
      },
      {
        path: 'profs',
        title: 'Profs',
        component: ProfsComponent,
      },
      {
        path: 'students',
        title: 'Students',
        component: StudentsComponent,
      },
      {
        path: 'calendar',
        title: 'Calendar',
        component: CalendarComponent,
      },
    ],
  },
  {
    path: "404",
    component: NotFoundComponent
  },
  {
    path: "**",
    redirectTo: "/404",
    pathMatch: "full"
  }
];
