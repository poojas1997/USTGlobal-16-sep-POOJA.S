import { Component, OnInit } from '@angular/core';
import { LmspService } from '../lmsp.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-issue',
  templateUrl: './issue.component.html',
  styleUrls: ['./issue.component.css']
})
export class IssueComponent implements OnInit {

  constructor(private auth: LmspService) { }

  user;
  uid;
  bid;
  isid;
  date = new Date();

  ngOnInit() {
  }

  Issueform(form: NgForm) {
    console.log(form.value);
    this.auth.issueBook(form.value).subscribe(data => {
      console.log(data);
      if (data && data.message === 'Success') {
        alert('Book Issued')
      } else {
        alert('Book not issued');
      }
      // tslint:disable-next-line: no-unused-expression
      form.reset;
    });

  }

}
