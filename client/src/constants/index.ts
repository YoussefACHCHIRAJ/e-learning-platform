import { Roles } from "../app/shared/authorization/roles";
import { auth } from "../app/utils/functions";

export const eventList = [
  {
    title: 'cours 1',
    start: '2024-02-10T10:00:00',
    end: '2024-02-10T11:45:00',
  },
  {
    title: 'cours 2',
    start: '2024-02-14T8:30:00',
    end: '2024-02-10T10:45:00',
  },
  {
    title: 'cours 4',
    start: '2024-03-08T14:00:00',
    end: '2024-03-08T14:45:00',
  },
  {
    title: 'cours 5',
    start: '2024-03-10T16:00:00',
    end: '2024-03-10T17:45:00',
  },
  {
    title: 'cours 6',
    start: '2024-03-01T09:00:00',
    end: '2024-03-01T10:45:00',
  },
];


export const navigationButtonsValues = [
  {
    icon: "fa-solid fa-house",
    content: "Learn",
    path: "dashboard",

    title: `Welcome back ${auth()?.user.firstname}`,
    isActive: true,
    authorities: [Roles.ADMIN, Roles.PROF, Roles.STUDENT]
  },
  {
    icon: "fa-solid fa-route",
    content: "Paths",
    path: "dashboard/paths",
    title: "Paths",
    isActive: false,
    authorities: [Roles.ADMIN, Roles.PROF, Roles.STUDENT]
  },
  {
    icon: "fas fa-user",
    content: "Profile",
    path: "dashboard/profile",
    title: "Your Profile",
    isActive:  false,
    authorities: [Roles.ADMIN, Roles.PROF, Roles.STUDENT]
  },
  {
    icon: "fa-solid fa-users-rectangle",
    content: "Groups",
    path: "dashboard/groups",
    title: "Groups List",
    isActive: false,
    authorities: [Roles.ADMIN, Roles.PROF]
  },
  {
    icon: "fa-solid fa-user-tie",
    content: "Profs",
    path: "dashboard/profs",
    title: "Profs List",
    isActive: false,
    authorities: [Roles.ADMIN]
  },
  {
    icon: "fa-solid fa-user-group",
    content: "Students",
    path: "dashboard/students",
    title: "Students List",
    isActive: false,
    authorities: [Roles.ADMIN, Roles.PROF]
  },
  {
    icon: "fa-solid fa-calendar-days",
    content: "Calender",
    path: "dashboard/calendar",
    title: "Calendar",
    isActive: false,
    authorities: [Roles.ADMIN, Roles.PROF, Roles.STUDENT]
  },
]
