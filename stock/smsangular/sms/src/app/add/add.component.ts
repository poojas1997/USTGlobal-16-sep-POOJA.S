import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { SmsService } from '../sms.service';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  constructor(private auth: SmsService) { }

  ngOnInit() {
  }


  Addform(form: NgForm) {
    console.log(form.value);
    this.auth.AddProduct(form.value).subscribe(data => {
      console.log(data);
      if (data && data.message === 'Product added Succesfully') {
        alert('Product added succesfully');
      }
    });
  }

}
