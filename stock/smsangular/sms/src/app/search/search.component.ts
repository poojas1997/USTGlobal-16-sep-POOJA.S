import { Component, OnInit } from '@angular/core';
import { SmsService } from '../sms.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {

  constructor(private auth: SmsService) { }

  product;
  ngOnInit() {
  }

  searchProduct(search: NgForm) {
    console.log(search.value);
    this.auth.serachProduct(search.value).subscribe(res => {
      this.product = res.productBean[0];
      console.log(res);
      // tslint:disable-next-line: no-unused-expression
      search.reset;
    });
  }

}
