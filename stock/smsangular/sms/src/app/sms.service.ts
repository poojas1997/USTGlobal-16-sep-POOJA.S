import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class SmsService {

  constructor(private http:HttpClient) { }

  AddProduct(product):Observable<any>{
    return this.http.post('http://localhost:8081/add', product);
  }

  getProduct():Observable<any>{
    return this.http.get('http://localhost:8081/getAll');
  }

  Modify(product):Observable<any>{
    return this.http.post('http://localhost:8081/update' , product);
  }

  serachProduct(id):Observable<any>{
    return this.http.get(`http://localhost:8081/searchid/${id}` ,id);
  }
}
