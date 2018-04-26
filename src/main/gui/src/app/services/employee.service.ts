import { Injectable} from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs/Rx';
import { Employee } from "app/models/employee";
 
@Injectable()
export class EmployeeService {
   constructor(private http: Http) {
	   console.log("EmployeeService constr...");
   }
 
   getEmployees(): Observable<Employee[]> {
	  console.log("getEmployees....");
      return this.http.get("http://localhost:8080/mongo-angular-billet/api/employee")
         .map((res: Response) => res.json())
         .catch((error: any) => Observable.throw(error.json().error || 'Server error'));
   }
}