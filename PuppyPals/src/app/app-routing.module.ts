import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FavoritesComponent } from './components/favorites/favorites.component';
import { HomeComponent } from './components/home/home.component';
import { KennelComponent } from './components/kennel/kennel.component';
import { LoginComponent } from './components/login/login.component';

const routes: Routes = [
  {component: LoginComponent,path:""},
  {component: HomeComponent,path:"home"},
  {component: KennelComponent,path:"kennel"},
  {component: FavoritesComponent,path:"favorites"}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
