import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RestapiService {

  constructor(private http:HttpClient) { }

login(username:string,password:string){
  const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa(username + ':' + password) });
  return this.http.get("http://localhost:8080/",{headers,responseType: 'text' as 'json'})
}

  getUsers() {
    let username='springboot'
    let password='sp123'
    const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa(username + ':' + password) });
   return  this.http.get("http://localhost:8080/getUsers",{headers});
  }
}

