import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { FirstComponent } from './first/first.component';
import { MediaBaseComponent } from './media-base/media-base.component';
import { Mediabase2Component } from './mediabase2/mediabase2.component';

@NgModule({
  declarations: [
    AppComponent,
    FirstComponent,
    MediaBaseComponent,
    Mediabase2Component
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
