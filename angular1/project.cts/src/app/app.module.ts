import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { NavigatorComponent } from './navigator/navigator.component';
import { Navigator1Component } from './navigator1/navigator1.component';

@NgModule({
  declarations: [
    AppComponent,
    NavigatorComponent,
    Navigator1Component
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
