import { Component, NgModule, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, FormGroupName } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { from } from 'rxjs';
import { Router } from '@angular/router';
import { RegisterService } from './register.service';
import { Account } from './register';
import { HttpClient } from '@angular/common/http';



@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css'],
  providers: [RegisterService]
})


export class RegisterComponent implements OnInit {
  [x: string]: any;

  private account: Account[] | undefined;
  constructor(private router:Router, registerService: RegisterService ) { }

  ngOnInit() {
  }

  //public saveAccount(saveAccount:Account){
    // let headers = {'content-type':'application/json'}
    // let body = JSON.stringify(saveAccount);
    // this['httpClient'].post("http://localhost:12345/account/new", body,{'headers':headers})
    // }

    createUser() {
      let id = (<HTMLInputElement>document.getElementById('id')).value;
      let username = (<HTMLInputElement>document.getElementById('username')).value;
      let pass = (<HTMLInputElement>document.getElementById('pass')).value;
      let firstname = (<HTMLInputElement>document.getElementById('firstname')).value;
      let lastname = (<HTMLInputElement>document.getElementById('lastname')).value;
      let email = (<HTMLInputElement>document.getElementById('email')).value;
      let account = new Account(0, username, pass, firstname, lastname, email);
      this['registerService'].createUser(account).then(
      (account: any) => {
      this.account = account;
      },
      (err: any) => {
      console.log(err);
      }
      );

  }

}






