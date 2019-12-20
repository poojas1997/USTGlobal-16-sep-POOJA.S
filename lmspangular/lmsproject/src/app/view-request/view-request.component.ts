import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LmspService } from '../lmsp.service';

@Component({
  selector: 'app-view-request',
  templateUrl: './view-request.component.html',
  styleUrls: ['./view-request.component.css']
})
export class ViewRequestComponent implements OnInit {

  book;
  user;
  bid;
  uid;
  constructor(private router: Router, private auth: LmspService) { }

  ngOnInit() {
  }

  
 getRequest(books) {
    const book = JSON.parse(localStorage.getItem('issueBook'));

    this.bid = book.bookbeans[0].bid;
    this.uid = book.adminbeans[0].id;

    this.auth.getRequest(this.bid , this.uid).subscribe(data =>  {
     
     
  console.log(data)
  })
  }
  
  }
