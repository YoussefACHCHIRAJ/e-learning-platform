import { User } from '../shared/model/user.model';

export interface AuthResponseType {
  statusCode: number;
  token: string | null;
  message: string;
  authUser: User | null;
}

export interface AuthType {
  token: string;
  user: User;
}

export interface CalendarEventsType {
  title: string;
  start: string;
  allDay: boolean;
}

