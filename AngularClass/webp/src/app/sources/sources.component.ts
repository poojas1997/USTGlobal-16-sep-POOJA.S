// import { Component, OnInit } from '@angular/core';
// import { HttpClient } from '@angular/common/http';

// @Component({
//   selector: 'app-sources',
//   templateUrl: './sources.component.html',
//   styleUrls: ['./sources.component.css']
// })
// export class SourcesComponent implements OnInit {

//   news;
//   value='in';
//   constructor(private http: HttpClient) {
//     this.getNews
//    }

//    getNews(Value) {
//     this.http.get<any>(`https://newsapi.org/v2/top-headlines?country=${value}&apiKey=bd69e381bb38416f98dc53126dddda60`).subscribe(data =>{
//       this.news = data.articles;
//       }, err => {
//         console.log(err);
//       }, () => {
//         console.log("news got successfully");
//       });

//    }

//   ngOnInit() {
//   }

// }
