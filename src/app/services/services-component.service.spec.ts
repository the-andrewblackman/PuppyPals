import { TestBed } from '@angular/core/testing';

import { ServicesComponentService } from './services-component.service';

describe('ServicesComponentService', () => {
  let service: ServicesComponentService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ServicesComponentService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
