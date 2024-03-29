import { Injectable } from '@angular/core';
import { CategorySection } from '../model/category-section.model';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class CategorySectionService {
  private categorySetcion:CategorySection;
  private categorysections:Array<CategorySection>;

  constructor(private http :HttpClient) { }





}
