import { Component, OnInit } from '@angular/core';
import { ServicesComponentService } from 'src/app/services/services-component.service';
@Component({
  selector: 'app-favorites',
  templateUrl: './favorites.component.html',
  styleUrls: ['./favorites.component.css']
})
export class FavoritesComponent implements OnInit {

  constructor(private servicesComponent: ServicesComponentService) { }


  
  ngOnInit(): void {
  
    this.findDogByBreedName("terrier")

  }
	// results are from the dog API
   findDogByBreedNameInput:any[] = []

  public findDogByBreedName(breedname:String) {
    // findDogByBreedName from the service layer, passing in breedname
    this.servicesComponent.findDogByBreedName(breedname).subscribe(
      (data: any[]) => {
        // sends all dogs to findAllDogAPIInput variable
        this.findDogByBreedNameInput = data;
        console.log(this.findDogByBreedNameInput)
      },
      () => {
        console.log("findDogByBreedName didn't work.")
      }
    )
  }
}