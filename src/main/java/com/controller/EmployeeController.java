package com.controller;

import com.controller.modal.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController

public class EmployeeController {
    List<Employee> EmployeeList = new ArrayList<>();

// Hard Coding program................
//    @RequestMapping( "/add_employee")
//    public String add(){
//        Employee employee = new Employee("krishna",26,"IT");
//        EmployeeList.add(employee);
//        return "Object is successfully added";
//    }
//
//    @RequestMapping("get_employee")
//    public List<Employee> getEmployeeList(){
//        return EmployeeList;
//    }
//
//    @RequestMapping("/update_employee")
//    public String update(){
//        EmployeeList.get(0).setName("kaushal");
//        return "Object is successfully update";
//    }
//
//    @RequestMapping("/delete_employee")
//    public String Delete(){
//        EmployeeList.remove(0);
//        return "Object is successfully deleted";
//    }
    @RequestMapping(value = "/add_employee",method = RequestMethod.POST)
    public String add(@RequestBody Employee employee){
        EmployeeList.add(employee);
        return "Object is successfully added";
    }

    @RequestMapping(value = "get_employee",method = RequestMethod.GET)
    public List<Employee> getStringList(){
        return EmployeeList;
    }

    @RequestMapping(value = "/updated_employee/{name}",method = RequestMethod.PUT)
    public String upDate(@PathVariable String name){
        EmployeeList.get(0).setName(name);
        return "Object is successfully updated";
    }

    @RequestMapping(value = "/delete_employee/{id}",method = RequestMethod.DELETE)
    public String delete(@PathVariable int id){
        EmployeeList.remove(id);
        return "Object is successfully deleted";
    }
}


