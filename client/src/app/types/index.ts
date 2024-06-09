import { Course } from '../shared/model/learn/course.model';
import { Path } from '../shared/model/learn/path.model';
import { Section } from '../shared/model/learn/section.model';
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

export interface RequestBodyInterface{
  path: Path,
  courses: Course[],
  sections: Section[]
}

