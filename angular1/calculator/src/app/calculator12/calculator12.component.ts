import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator12',
  templateUrl: './calculator12.component.html',
  styleUrls: ['./calculator12.component.css']
})
export class Calculator12Component{
  value1:number;
  value2:number;
  add:number;
  sub:number;
  result:number;
  saveadd(num1:HTMLInputElement,num2:HTMLInputElement,result:HTMLInputElement)
  {
    this.value1=parseInt(num1.value);
    this.value2=parseInt(num2.value);
    this.result=this.value1+this.value2;
  }
  savesub(num1:HTMLInputElement,num2:HTMLInputElement,result:HTMLInputElement)
  {
    this.value1=parseInt(num1.value);
    this.value2=parseInt(num2.value);
    this.result=this.value1-this.value2;
  }

  

}
