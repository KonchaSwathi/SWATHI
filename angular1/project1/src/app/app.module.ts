import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { Firstcomponent } from './first/first.component';
import { EntryFormComponent } from './entry-form/entry-form.component';

@NgModule({
  declarations: [
    AppComponent,
    Firstcomponent,
    EntryFormComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
