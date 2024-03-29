import { Injectable } from '@angular/core';
import { CategorySection } from '../../model/learn/category-section.model';

@Injectable({
  providedIn: 'root'
})
export class CategorySectionService {
  private categorySetcion:CategorySection;
  private categorysections:Array<CategorySection>;

  constructor() { }
}
