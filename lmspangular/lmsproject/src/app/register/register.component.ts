import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { LmspService } from '../lmsp.service';
import { error } from 'util';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  error: string;
  message: string;
  constructor(private auth: LmspService, private router: Router) { }




  Registerform(registerform: NgForm) {
    this.error = null;
    console.log(registerform.value);
    this.auth.registerUser(registerform.value)
      .subscribe(res => {
        console.log(res);
        if (res.statusCode === 201) {
          this.message = 'Registration succesfull';
          localStorage.setItem('userDetails', JSON.stringify(res));

          if (res && res.adminbeans[0].role === 'admin') {
            this.auth.isAdminLogin = true;
            this.router.navigateByUrl('/');
          } else if (res && res.adminbeans[0].role === 'user') {
            this.auth.isUserLogin = true;
            this.router.navigateByUrl('/');
          } else {
            this.router.navigateByUrl('/register');
          }
        } else {
          this.error = 'Already registered..Please Login';
        }
        registerform.reset();
      }, err => {
        console.log(err);
        this.error = err.error.message;
      });

  }


  ngOnInit() {
  }

  // tslint:disable-next-line: use-lifecycle-interface
  ngOnDestroy() {
    this.error = null;
  }

}
