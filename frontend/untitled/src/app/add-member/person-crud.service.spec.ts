import { TestBed } from '@angular/core/testing';

import { PersonCrudService } from './person-crud.service';

describe('PersonCrudService', () => {
  let service: PersonCrudService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PersonCrudService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
