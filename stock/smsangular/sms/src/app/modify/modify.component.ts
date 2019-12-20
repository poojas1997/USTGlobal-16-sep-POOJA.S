import { Component, OnInit } from '@angular/core';
import { SmsService } from '../sms.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-modify',
  templateUrl: './modify.component.html',
  styleUrls: ['./modify.component.css']
})
export class ModifyComponent implements OnInit {

  constructor(private auth: SmsService) { }

  ngOnInit() {
  }

  Modifyform(form: NgForm) {
    console.log(form.value);
    this.auth.AddProduct(form.value).subscribe(data => {
      console.log(data);
      // tslint:disable-next-line: triple-equals
      if (data && data.statusMesssage == 'Product added Succesfully'){
      alert('Modified succesfully');
    }
    });
  }
}
