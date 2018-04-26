import { Component } from '@angular/core';
import { EmployeeService } from "app/services/employee.service";
@Component({
  selector: 'employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})

export class EmployeeComponent {
  title = 'Employees';
  employees;
  constructor(private employeeService: EmployeeService) {
	  this.employees = employeeService.getEmployees();
	  console.log(':' +  this.employees);
   }
}
