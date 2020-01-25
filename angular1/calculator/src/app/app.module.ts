import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { FirstComponent } from './first/first.component';
import { Calculator12Component } from './calculator12/calculator12.component';

@NgModule({
  declarations: [
    AppComponent,
    FirstComponent,
    Calculator12Component
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
