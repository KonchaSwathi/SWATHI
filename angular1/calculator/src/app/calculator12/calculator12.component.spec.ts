import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Calculator12Component } from './calculator12.component';

describe('Calculator12Component', () => {
  let component: Calculator12Component;
  let fixture: ComponentFixture<Calculator12Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Calculator12Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Calculator12Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
