package com.coders.employeManager.logging;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class EmployeeResourceLogger {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("execution(public * com.coders.employeManager.controller.EmployeeResource.addEmployee(*))")
    public void beforeAddEmployee() {
        logger.info("Executing addEmployee() Method .....");
    }

    @After("execution(public * com.coders.employeManager.controller.EmployeeResource.addEmployee(*))")
    public void afterAddEmployee() {
        logger.info("Successfully Executed addEmployee() Method");
    }

    @Before("execution(public * com.coders.employeManager.controller.EmployeeResource.getAllEmployees())")
    public void beforeGetAllEmployees() {
        logger.info("Executing getAllEmployees() Method .....");
    }

    @After("execution(public * com.coders.employeManager.controller.EmployeeResource.getAllEmployees())")
    public void afterGetAllEmployees() {
        logger.info("Successfully Executed getAllEmployees() Method");
    }

    @Before("execution(public * com.coders.employeManager.controller.EmployeeResource.deleteEmployeeById(*))")
    public void beforeDeleteEmployeeById() {
        logger.info("Executing deleteEmployeeById() Method .....");
    }

    @After("execution(public * com.coders.employeManager.controller.EmployeeResource.deleteEmployeeById(*))")
    public void afterDeleteEmployeeById() {
        logger.info("Successfully Executed deleteEmployeeById() Method");
    }

    @Before("execution(public * com.coders.employeManager.controller.EmployeeResource.updateEployeeById(*))")
    public void beforeUpdateEployeeById() {
        logger.info("Executing updateEployeeById() Method .....");
    }

    @After("execution(public * com.coders.employeManager.controller.EmployeeResource.updateEployeeById(*))")
    public void afterUpdateEployeeById() {
        logger.info("Successfully Executed updateEployeeById() Method");
    }

}
