import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PuppyCardComponent } from './puppy-card.component';

describe('PuppyCardComponent', () => {
  let component: PuppyCardComponent;
  let fixture: ComponentFixture<PuppyCardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PuppyCardComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PuppyCardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
