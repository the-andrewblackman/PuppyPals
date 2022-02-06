import { Component, OnInit } from '@angular/core';

import { HttpClient } from '@angular/common/http';
import { AppService } from 'src/app/app.service';

@Component({
  templateUrl: './home.component.html'
})
export class HomeComponent {

  title = 'Puppy Pals';
  greeting = {};

  constructor(private app: AppService, private http: HttpClient) {
    http.get('resource').subscribe(data => this.greeting = data);
  }

  authenticated() { return this.app.authenticated; }

}