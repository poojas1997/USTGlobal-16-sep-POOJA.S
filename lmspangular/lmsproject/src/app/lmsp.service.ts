import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class LmspService {
  // baseURL = 'http://localhost:8087/lmsp';
  // header = new HttpHeaders ({'content-type': 'application/json'})

  constructor(private http: HttpClient) { }

  // tslint:disable-next-line: member-ordering
  isUserLogin = false;
  // tslint:disable-next-line: member-ordering
  isAdminLogin = false;
  home = true;

  registerUser(user): Observable<any> {
    return this.http.post('http://localhost:8087/lmsp/register', user);
  }

  loginUser(user): Observable<any> {
    return this.http.post('http://localhost:8087/lmsp/login', user);
  }

  addBook(user): Observable<any> {
    return this.http.post('http://localhost:8087/lmsp/add', user);
  }

  searchBook(bid): Observable<any> {
    return this.http.get(`http://localhost:8087/lmsp/search/${bid}`, bid);
  }

  getBook(): Observable<any> {
    return this.http.get(`http://localhost:8087/lmsp/get-all`);
  }

  removeBook(bid): Observable<any> {
    return this.http.delete(`http://localhost:8087/lmsp/delete/${bid}`);
  }

  requestBook(bid, id): Observable<any> {
    return this.http.post(`http://localhost:8087/lmsp/requestbook/${bid}/${id}`, bid, id);
  }

  issueBook(book): Observable<any> {
    return this.http.post('http://localhost:8087/lmsp/issue', book);
  }

  getRequest(uid , bid):Observable<any>{
    return this.http.get(`http://localhost:8087/lmsp/getRequest/${uid}/${bid}`);
  }
  isAdmin() {
    if (this.isAdminLogin) {
      return true;
    } else {
      return false;
    }
  }

  isUser() {
    if (this.isUserLogin) {
      return true;
    } else {
      return false;
    }
  }
}
