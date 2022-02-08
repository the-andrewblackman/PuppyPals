import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
//import { NgbMOdule } from '@ng-bootstrap/ng-bootstrap';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LogInComponent } from './components/log-in/log-in.component';
import { RegisterComponent } from './components/register/register.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AngularMaterialModule } from './angular-material.module';
import { FlexLayoutModule } from '@angular/flex-layout';
import { HttpClientModule } from '@angular/common/http';
import { MAT_FORM_FIELD_DEFAULT_OPTIONS } from '@angular/material/form-field';
import { FormGroup, FormControl } from '@angular/forms';
import { from } from 'rxjs';
import { RouterModule, Routes } from '@angular/router';
import { AppService } from './app.service';
import { HomeComponent } from './components/home/home.component';




const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: 'home'},
  { path: 'register', component: RegisterComponent},
  { path: 'login', component: LogInComponent}
];
@NgModule({
  declarations: [
    AppComponent,
    LogInComponent,
    RegisterComponent,
    LogInComponent,
    
    
  ],
  imports: [
    RouterModule.forRoot(routes),
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    AngularMaterialModule,
    FlexLayoutModule,
    FormsModule, 
    ReactiveFormsModule, 
    HttpClientModule,
  
  ],
  providers: [AppService],
  bootstrap: [AppComponent],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class AppModule { }
