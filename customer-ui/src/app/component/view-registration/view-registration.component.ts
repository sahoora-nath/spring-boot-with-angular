import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../../services/customer.service';
import { ActivatedRoute } from '../../../../node_modules/@angular/router';

@Component({
  selector: 'app-view-registration',
  templateUrl: './view-registration.component.html',
  styleUrls: ['./view-registration.component.css']
})
export class ViewRegistrationComponent implements OnInit {

  public customer;
  constructor(private customerService: CustomerService, private route:ActivatedRoute) { }

  ngOnInit() {
    this.getCustomer(this.route.snapshot.params.id);
  }

  getCustomer(id:number){
    this.customerService.getCustomer(id).subscribe(
      data=>{
        console.log(data);
        this.customer=data;
      },
      err=>console.error(err),
      ()=>console.log("Customer loaded")
    );
  }
}
