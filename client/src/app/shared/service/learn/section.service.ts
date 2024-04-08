import { Injectable } from '@angular/core';
import { Section } from '../../model/learn/section.model';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class SectionService {
  private _section!: Section;
  
  private _sections!: Array<Section>;
  
  constructor(private http:HttpClient) { }

  public get section(): Section {
    return this._section;
  }
  public set section(value: Section) {
    this._section = value;
  }
  
  public get sections(): Array<Section> {
    return this._sections;
  }
  public set sections(value: Array<Section>) {
    this._sections = value;
  }

}
