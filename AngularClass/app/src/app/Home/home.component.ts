import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
    selector : 'app-home',
    templateUrl : './home.component.html',
    styleUrls : ['./home.component.css']
})

 export class HomeComponent {
    news;
    constructor(private http: HttpClient) {
        this.getNews();
    }

        getNews() {
            // tslint:disable-next-line: max-line-length
            this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=06b95a5c1a644562af23f91b52a92285').subscribe( data => {
            this.news = data.articles;
            }, err => {
                console.log(err);
            // tslint:disable-next-line: no-unused-expression
            }, () => {
                console.log('news got successfully');
            });
    }
}



