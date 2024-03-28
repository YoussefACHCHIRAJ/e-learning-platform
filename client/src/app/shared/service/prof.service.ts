import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { AvailabilityProf } from '../model/availabilityprof.model';
import { AvailabilityProfDetails } from '../model/availability-prof-details.model';
import { Observable } from 'rxjs';
import { Day } from '../model/day.model';

interface ResponseType {
  statusCode: number;
  message: string;
}
interface RequestBodyType {
  profEmail: string,
  profAvailabilitiesDetails:AvailabilityProfDetails[]
}

@Injectable({
  providedIn: 'root',
})
export class ProfService {

  private _days!: Day[];

  private _requstBody!: RequestBodyType;
  
  
  private _profAvailability!: AvailabilityProf;
  private _profAvailabilities!: AvailabilityProf[];

  private _profAvailabilityDetails!: AvailabilityProfDetails;
  private _profAvailabltiesDetails!: AvailabilityProfDetails[];

  private _url = 'http://localhost:8090/api/prof/';

  constructor(private http: HttpClient) {}

  saveProfAvailability(): Observable<ResponseType> {
    return this.http.post<ResponseType>(this.url + "availability", this.requstBody);
  }

  findAllDays():Observable<Day[]>{
    return this.http.get<Day[]>(this.url + "days");
  }

  public get requstBody(): RequestBodyType {
    return this._requstBody;
  }
  public set requstBody(value: RequestBodyType) {
    this._requstBody = value;
  }

  public get days(): Day[] {
    return this._days;
  }
  public set days(value: Day[]) {
    this._days = value;
  }

  public get profAvailability(): AvailabilityProf {
    return this._profAvailability;
  }
  public set profAvailability(value: AvailabilityProf) {
    this._profAvailability = value;
  }
  public get profAvailabilities(): AvailabilityProf[] {
    return this._profAvailabilities;
  }
  public set profAvailabilities(value: AvailabilityProf[]) {
    this._profAvailabilities = value;
  }
  public get profAvailabilityDetails(): AvailabilityProfDetails {
    return this._profAvailabilityDetails;
  }
  public set profAvailabilityDetails(value: AvailabilityProfDetails) {
    this._profAvailabilityDetails = value;
  }
  public get profAvailabltiesDetails(): AvailabilityProfDetails[] {
    return this._profAvailabltiesDetails;
  }
  public set profAvailabltiesDetails(value: AvailabilityProfDetails[]) {
    this._profAvailabltiesDetails = value;
  }

  public get url() {
    return this._url;
  }
  public set url(value) {
    this._url = value;
  }
}
