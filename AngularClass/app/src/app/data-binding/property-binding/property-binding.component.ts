import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
   name = 'Sundari';
   imgUrl = 'https://cdn.pixabay.com/photo/2019/06/02/17/27/summer-4246927__340.jpg';
   address = 'VijayNagar , Moddalapallya - 560072';
   colorname = 'Purple';
   isActive : boolean = false ;
   colspanValue : number = 2;

  constructor() { }

  ngOnInit() {
    setInterval(() => {
      this.colorname = 'red';
      this.isActive = !this.isActive;
    }, 1000);
  }

}
