import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { NavComponent } from './components/components/nav/nav.component';
import { FavoritesComponent } from './components/favorites/favorites.component';
import { HomeComponent } from './components/home/home.component';
import { KennelComponent } from './components/kennel/kennel.component';
import { LogInComponent } from './components/log-in/log-in.component';


const routes: Routes = [
  {path:"",component: LogInComponent},
  {path:"puppypals",component:NavComponent,
  children:[
  {path:"home",component:HomeComponent},
  {path:"favorites",component:FavoritesComponent},
  {path:"kennel",component:KennelComponent}]
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
