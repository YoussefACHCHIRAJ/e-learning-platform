import { Routes } from '@angular/router';
import { DashboardComponent } from './pages/dashboard/dashboard.component';
import { AuthComponent } from './pages/auth/auth.component';
import { ProfileComponent } from './pages/profile/profile.component';
import { HomeComponent } from './pages/home/home.component';
import { NotFoundComponent } from './pages/not-found/not-found.component';
import { CalendarComponent } from './pages/calendar/calendar.component';

import {ProfsComponent} from "./pages/profs/profs.component";
import { GroupsComponent } from './pages/groups/groups.component';
import { DashboardLayoutComponent } from './layout/dashboard-layout/dashboard-layout.component';
import { StudentsComponent } from './pages/students/students.component';
import { PathsComponent } from './pages/learn/paths/paths.component';
import { CreatePathsComponent } from './pages/learn/paths/create-paths/create-paths.component';
import { CreatePathsLayoutComponent } from './layout/create-paths-layout/create-paths-layout.component';

import {CreateCourseComponent} from "./pages/learn/course/create-course/create-course.component";
import {CreateSectionComponent} from "./pages/learn/section/create-section/create-section.component";

import { StudentRegisterComponent } from './pages/auth/student-register/student-register.component';
import { ProfRegisterComponent } from './pages/auth/prof-register/prof-register.component';



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
    path: 'student-register',
    title: 'student-register',
    component: StudentRegisterComponent,
  },
  {
    path: 'prof-register',
    title: 'prof-register',
    component: ProfRegisterComponent,
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
        path: 'paths',
        title: 'Paths',
        component: PathsComponent,
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
    path: "paths/create",
    title: "Create new Path",
    component: CreatePathsLayoutComponent,
    children: [
      {
        path: 'path-info',
        component: CreatePathsComponent
      },
      {
        path: 'cours-info',
        component: CreateCourseComponent
      },
      {
        path: 'section-info',
        component: CreateSectionComponent
      }
    ]
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
