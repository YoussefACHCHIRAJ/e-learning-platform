import { TestBed } from '@angular/core/testing';

import { MultimediaTypeService } from './multimedia-type.service';

describe('MultimediaTypeService', () => {
  let service: MultimediaTypeService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MultimediaTypeService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
