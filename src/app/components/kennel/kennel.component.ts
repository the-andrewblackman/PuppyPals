import { Component, OnInit } from '@angular/core';
import { KennelTable } from 'src/app/models/KennelTable';
@Component({
  selector: 'app-kennel',
  templateUrl: './kennel.component.html',
  styleUrls: ['./kennel.component.css']
})
export class KennelComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
@Input()
findKennelByIdInput:KennelTable[] = []
findKennelByAccountIdInput[] = []
findAllKennelInput[] = []


public saveKennel(saveKennel:KennelTable){
  // saveKennel from service layer, passes kennel through, saves in table.
  this.servicesComponent.saveKennel(saveKennel).subscribe(
    () => {
      // refreshes the kennel on page, by running findAllKennel 
      this.findAllKennel();
    },
    () => {
      console.log("saveKennel didn't work.")
    }
  )
}

public findKennelById(id:Number){
      // findKennelById from service layer, passes through an id
   this.servicesComponent.findKennelById(id).subscribe(
      (data) => {
         // sends the dog to the findKennelByIdInput variable
            this.findKennelByIdInput = data;
          },
          () => {
            console.log("findKennelById didn't work.")
          }
        )
    }

 public findKennelByAccountId(id:Number){
      // findKennelByAccountId from service layer, passes through an id
   this.servicesComponent.findKennelByAccountId(id).subscribe(
      (data) => {
         // sends the kennel to the findKennelByIdInput variable
            this.findKennelByAccountIdInput = data;
          },
          () => {
            console.log("findKennelByAccountId didn't work.")
          }
        )
    }


 public findAllKennel() {
  // findAllDogs from the service layer
  this.servicesComponent.findAllKennel().subscribe(
    (data) => {
      // sends all dogs to findAllKennelInput variable
      this.findAllKennelInput = data;
    },
    () => {
      console.log("findAllKennel didn't work.")
    }
  )
}

public deleteKennel(deleteKennel:KennelTable){
  // deleteKennel from the service layer, passing through an kennel to delete
  this.servicesComponent.deleteKennel(deleteKennel).subscribe(
    () => {
      // refreshes the kennels on page, by running findAllKennel again
      this.findAllKennel();
    },
    () => {
      console.log("deleteKennel didn't work.")
    }
  )
}