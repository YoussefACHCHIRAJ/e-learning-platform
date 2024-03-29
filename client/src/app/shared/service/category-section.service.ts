import { Injectable } from '@angular/core';
<<<<<<<< HEAD:client/src/app/shared/service/learn/category-section.service.ts
import { CategorySection } from '../../model/learn/category-section.model';
========
import { CategorySection } from '../model/category-section.model';
import { HttpClient } from '@angular/common/http';

>>>>>>>> 4acae8a95e95548a7d752880d3600a892a1010b5:client/src/app/shared/service/category-section.service.ts

@Injectable({
  providedIn: 'root'
})
export class CategorySectionService {
  private categorySetcion:CategorySection;
  private categorysections:Array<CategorySection>;

  constructor(private http :HttpClient) { }





}
