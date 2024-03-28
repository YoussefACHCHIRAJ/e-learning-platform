import { Injectable } from '@angular/core';
import { CategorySection } from '../../controller/model/category-section.model';


@Injectable({
  providedIn: 'root'
})
export class CategorySectionService {
  private categorySetcion:CategorySection;
  private categorysections:Array<CategorySection>;

  constructor() { }
}
