import { Injectable } from '@angular/core';
import { RegisterComponent } from './register.component';
//import {HttpClientModule} from '@angular/common/http';
//import 'rxjs/add/operator/toPromise';
import { HttpClient, HttpHeaders, HttpResponse } from '@angular/common/http';
import { Account } from './register';
import { AnyCatcher } from 'rxjs/internal/AnyCatcher';
import { Observable } from 'rxjs';





@Injectable({
  providedIn: 'root'
})
export class RegisterService {

  private url = '/http://localhost:12345/account/new';
  registerService: any;

  constructor(private http:HttpClient) { }

  // public saveAccount(saveAccount:Account){
  //   this.registerService.saveAccount(saveAccount)
  // }

  public createUser(account: Account): Observable<Account> {
    //const accHeaders = new Headers({ 'Content-Type': 'application/json' });
    return this.http.post<Account>(this.url, JSON.stringify(account), )
    //.toPromise()
   // .then(response => response.json() as Account[])
    //.catch(this.handleError);
    }
  
  private handleError(error: any): Promise<Array<any>> {
    console.error('An error occurred', error);
    return Promise.reject(error.message || error);
    }
  }