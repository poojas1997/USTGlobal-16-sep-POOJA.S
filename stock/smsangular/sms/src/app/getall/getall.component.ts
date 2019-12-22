import { Component, OnInit } from '@angular/core';
import { SmsService } from '../sms.service';

@Component({
  selector: 'app-getall',
  templateUrl: './getall.component.html',
  styleUrls: ['./getall.component.css']
})
export class GetallComponent implements OnInit {

  product;
  constructor(private  auth: SmsService) { }

  ngOnInit() {
  }

  getproducts() {
    console.log('hi from product component');
    this.auth.getProduct().subscribe(res => {
      console.log(res);
      this.product = res;
    }, err => {
      console.log(err);
    });
    console.log('subscription ended');
  }

}
