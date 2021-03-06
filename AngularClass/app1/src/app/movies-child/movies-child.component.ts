import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-movies-child',
  templateUrl: './movies-child.component.html',
  styleUrls: ['./movies-child.component.css']
})
export class MoviesChildComponent implements OnInit {
  @Input() movie: {poster: string , name: string};

  constructor() { }

  ngOnInit() {
  }

}
