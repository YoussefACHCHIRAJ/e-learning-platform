import { Injectable } from '@angular/core';
<<<<<<<< HEAD:client/src/app/shared/service/learn/section.service.ts
import { Section } from '../../model/learn/section.model';
========

>>>>>>>> 4acae8a95e95548a7d752880d3600a892a1010b5:client/src/app/shared/service/section.service.ts
import { HttpClient } from '@angular/common/http';
import { Section } from '../model/section.model';

@Injectable({
  providedIn: 'root'
})
export class SectionService {
  private section:Section;
  private sections:Array<Section>;

  constructor(private http:HttpClient) { }
}
