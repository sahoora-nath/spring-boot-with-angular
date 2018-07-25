import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
//import { Observable } from "rxjs/Observable";

const httpOptions = {
  headers: new HttpHeaders({'Content-Type': 'application/json'})
};

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(private http:HttpClient) { }

  getCustomers() {
    return this.http.get('/server/api/v1/customers');
  }

  getCustomer(id: number) {
    return this.http.get('/server/api/v1/customers/'+id);
  }

  createCustomerReg(customer) {
    let body=JSON.stringify(customer);
    return this.http.post('/server/api/v1/customers', body, httpOptions);
  }
}
