import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, FormGroupName } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { from } from 'rxjs';
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {


  
  constructor() { }

  ngOnInit() {
   this.reactiveForm = new FormGroup({
    "firstname": new FormGroup(null, [Validators.required])
   })
  }

  

  userObj={

    username:'',
    pass:'',
    firstname:'',
    lastname:'',
    email:''

  }
  

  tempObj:any

  /*ReactiveForm*/
  reactiveForm:FormGroup

  
  
  public register(): void {
    
  }

 


}
