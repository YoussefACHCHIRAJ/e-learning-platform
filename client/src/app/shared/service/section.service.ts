import { Injectable } from '@angular/core';

import { HttpClient } from '@angular/common/http';
import { Section } from '../../controller/model/section.model';

@Injectable({
  providedIn: 'root'
})
export class SectionService {
  private section:Section;
  private sections:Array<Section>;

  constructor(private http:HttpClient) { }
}
