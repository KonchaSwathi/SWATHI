import { Component, OnInit } from '@angular/core';
import { mediaInformation } from '../model/media1';

@Component({
  selector: 'app-media-base',
  templateUrl: './media-base.component.html',
  styleUrls: ['./media-base.component.css']
})
export class MediaBaseComponent{
 
  mediainformations :Array<mediaInformation>
  constructor()
  {
    this.mediainformations = [
      new mediaInformation("audio","hello","#","audio1"),
      new  mediaInformation("video","hii","@","video1"),
      new  mediaInformation("third","hellothird","third#","third1"),
    ];
 }
  save(name:HTMLInputElement,desc:HTMLInputElement,tags:HTMLInputElement,file :HTMLInputElement):void
  {
    let m=new mediaInformation(name.value,desc.value,tags.value,file.value);
    this.mediainformations.push(m);

  }
      

} 


