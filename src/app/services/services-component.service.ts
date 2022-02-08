import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Favorite } from '../models/favorites';
import { Observable } from 'rxjs';
import { Account } from '../models/account';
import { KennelTable } from '../models/KennelTable';
@Injectable({
  providedIn: 'root'
})
export class ServicesComponentService {

  // ==========================================================
  // FAVORITE TABLE SERVICE METHODS
  // =========================================================

  constructor(private httpClient:HttpClient) {};

  public saveFavorite(saveFavorite:Favorite){
    let headers = {'content-type':'application/json'}
    let body = JSON.stringify(saveFavorite);
    this.httpClient.post("http://localhost:12345/favorite/save", body,{'headers':headers})
  }

  public findUserFavorites(id:Number):Observable<Favorite[]>{
    return this.httpClient.get("http://localhost:12345/favorite/findAll/" + id) as Observable<Favorite[]>
  }

  public deleteFavorite(deleteFavorite:Favorite){
    let headers = {'content-type':'application/json'}
    let body = JSON.stringify(deleteFavorite)
    this.httpClient.post("http://localhost:12345/favorite/delete", body,{'headers':headers})
  }
 public login(user:Account){
  let headers = {'content-type':'application/json'}
   let body= JSON.stringify(user)
  this.httpClient.post("http://localhost:12345/login", body,{'headers':headers})
 }
 public addAccount(user:Account){
  let headers = {'content-type':'application/json'}
  let body= JSON.stringify(user)
 this.httpClient.post("http://localhost:12345/account/new", body,{'headers':headers})
 }
 public saveKennel(saveKennel:KennelTable):Observable<any>{
  let headers = {'content-type':'application/json'}
  let body = JSON.stringify(saveKennel);
  return this.httpClient.post("http://localhost:12345/kennel/new", body,{'headers':headers})
}

public findKennelById(id:Number):Observable<KennelTable[]>{
    return this.httpClient.get("http://localhost:12345/kennel/find/" + id) as Observable<KennelTable[]>
}

public findKennelByAccountId(accountId:Number):Observable<KennelTable[]>{
  return this.httpClient.get("http://localhost:12345/kennel/findByAccount/" + accountId) as Observable<KennelTable[]>
}

public findAllKennel():Observable<KennelTable[]>{
  return this.httpClient.get("http://localhost:12345/kennel/find/all") as Observable<KennelTable[]>;
}

public deleteKennel(deleteKennel:KennelTable):Observable<any>{
  let headers = {'content-type':'application/json'}
  let body = JSON.stringify(deleteKennel)
  return this.httpClient.post("http://localhost:12345/kennel/delete", body,{'headers':headers})
}

}