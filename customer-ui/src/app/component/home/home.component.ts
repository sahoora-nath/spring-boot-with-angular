import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../../services/customer.service';
import { FormGroup, FormControl, Validator, Validators } from "@angular/forms";
import { Observable } from '../../../../node_modules/rxjs';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  countries:string[]=[
    'United Kingdom',
    'United States',
    'India',
    'Germany',
    'China'
  ];
  customerform:FormGroup;
  validMessage: string="";
  constructor(private customerService: CustomerService) { }

  ngOnInit() {
    this.customerform = new FormGroup({
      firstName: new FormControl('', Validators.required),
      lastName: new FormControl('', Validators.required),
      email: new FormControl('', Validators.required),
      contactDetail: new FormGroup({
        address1: new FormControl('', Validators.required),
        address2: new FormControl(''),
        city: new FormControl('', Validators.required),
        country: new FormControl('', Validators.required),
        postcode: new FormControl('', Validators.required)
      })
    });
  }

  submitRegistration() {
    if(this.customerform.valid) {
      this.validMessage="Your request for registration had been submitted. Thank you!!!";
      console.log(this.customerform.value);
      this.customerService.createCustomerReg(this.customerform.value).subscribe(
        data => {
          this.customerform.reset();
          return true;
        },
        error=>{
          return Observable.throw(error);
        }
      );
    } else {
      this.validMessage="Please fill out the form before submitting!!!";
    }
  }

}
