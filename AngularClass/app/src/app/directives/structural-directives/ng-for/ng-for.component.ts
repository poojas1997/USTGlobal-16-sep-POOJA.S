import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit {
  Products = [{
    img : 'https://cdn.pixabay.com/photo/2016/04/15/08/04/strawberries-1330459__340.jpg',
    name : 'strawberry',
    price : 90
  },
  {
    img :'https://cdn.pixabay.com/photo/2017/11/22/22/53/nuts-2971675__340.jpg',
    name : 'walnuts',
    price : 325
  },
  {
    img :'https://cdn.pixabay.com/photo/2017/11/30/08/56/ice-cream-2987955__340.jpg',
    name : 'chocobar',
    price : 35
  },
]
  constructor() { }

  ngOnInit() {
  }

}
