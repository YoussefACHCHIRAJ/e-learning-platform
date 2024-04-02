import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Injectable } from '@angular/core';
import { AvailabilityProf } from '../model/availabilityprof.model';
import { AvailabilityProfDetails } from '../model/availability-prof-details.model';
import { Observable } from 'rxjs';
import { Day } from '../model/day.model';
import { token } from '../../utils/functions';

interface ResponseType {
  statusCode: number;
  message: string;
}
interface RequestBodyType {
  profEmail: string;
  profAvailabilitiesDetails: AvailabilityProfDetails[];

}

@Injectable({
  providedIn: 'root',
})
export class ProfService {
  private _days!: Day[];
  private headers!: HttpHeaders;

  private _requestBody!: RequestBodyType;


  private _profAvailability!: AvailabilityProf;
  private _profAvailabilities!: AvailabilityProf[];

  private _profAvailabilityDetails!: AvailabilityProfDetails;
  private _profAvailabltiesDetails!: AvailabilityProfDetails[];

  private _url = 'http://localhost:8090/api/prof/';

  constructor(private http: HttpClient) {
    this.headers = new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': `Bearer ${token()}`,
    });
    console.log(this.headers)
  }

  saveProfAvailability(): Observable<ResponseType> {
    return this.http.post<ResponseType>(
      this.url + 'availability',
      this.requestBody,
      { headers: this.headers }
    );
  }

  findAllDays(): Observable<Day[]> {
    return this.http.get<Day[]>(this.url + 'days', { headers: this.headers });
  }

  public get requestBody(): RequestBodyType {
    return this._requestBody;
  }
  public set requestBody(value: RequestBodyType) {
    this._requestBody = value;
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
