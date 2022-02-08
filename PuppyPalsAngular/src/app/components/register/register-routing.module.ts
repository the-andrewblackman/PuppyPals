import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RegisterComponent } from './register.component';

const routes: Routes = [
{path: '/account', component: RegisterComponent},
];
@NgModule({
imports: [RouterModule.forChild(routes)],
exports: [RouterModule]
})
export class RegisterRoutingModule { }