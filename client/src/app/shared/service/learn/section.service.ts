import { Injectable } from '@angular/core';
import { Section } from '../../model/learn/section.model';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class SectionService {
  private section:Section;
  private sections:Array<Section>;

  constructor(private http:HttpClient) { }
}
