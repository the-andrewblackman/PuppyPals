
import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'puppy-card',
  templateUrl: './puppy-card.component.html',
  styleUrls: ['./puppy-card.component.css']
})
export class PuppyCardComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  // inherts dog from the *ngFor="let dog of findDogByBreedNameInput" on main component
  @Input()
  // any is your model type
  dog:any

}
