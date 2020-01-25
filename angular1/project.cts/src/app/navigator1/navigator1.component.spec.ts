import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Navigator1Component } from './navigator1.component';

describe('Navigator1Component', () => {
  let component: Navigator1Component;
  let fixture: ComponentFixture<Navigator1Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Navigator1Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Navigator1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
