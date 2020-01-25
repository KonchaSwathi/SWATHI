import { Component, OnInit, Input } from '@angular/core';
import { mediaInformation } from '../model/media1';

@Component({
  selector: 'app-mediabase2',
  templateUrl: './mediabase2.component.html',
  styleUrls: ['./mediabase2.component.css']
})
export class Mediabase2Component implements OnInit {
   @Input()
   medi:Array< mediaInformation>

  constructor() { }

  ngOnInit() {
  }

}
