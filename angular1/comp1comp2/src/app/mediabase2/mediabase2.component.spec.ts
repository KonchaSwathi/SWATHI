import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Mediabase2Component } from './mediabase2.component';

describe('Mediabase2Component', () => {
  let component: Mediabase2Component;
  let fixture: ComponentFixture<Mediabase2Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Mediabase2Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Mediabase2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
