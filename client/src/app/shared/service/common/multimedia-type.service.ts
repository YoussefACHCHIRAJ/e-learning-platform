import { Injectable } from '@angular/core';
import { MultimediaType } from '../../model/common/multimedia-type.model';

@Injectable({
  providedIn: 'root'
})
export class MultimediaTypeService {
private multimediaType:MultimediaType;
private multimediaTypes:Array<MultimediaType>;

  constructor() { }
}
