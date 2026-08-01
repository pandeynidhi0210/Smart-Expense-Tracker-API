# Smart-Expense-Tracker-API



Step 1

Create Spring Boot Project

Dependencies
1)Validation     ->spring-boot-starter-validation ✅
2)Web (REST API) ->spring-boot-starter-web ✅ (not spring-boot-starter-webmvc)
3)DevTools	  ->   spring-boot-devtools ✅
4)Testing  	  ->   spring-boot-starter-test ✅ (not spring-boot-starter-validation-test or spring-boot-starter-webmvc-test)





                    Client (Postman/Browser)
                              |
                    HTTP Request (GET/POST/PUT/DELETE)
                              |
                              v
                  ExpenseController.java
                              |
          -------------------------------------
          |        |        |        |        |
        GET      POST      PUT     DELETE   Category Total
          |        |        |        |        |
          v        v        v        v        v
                   ExpenseService
                   (Interface)
                          |
                          v
               ExpenseServiceImpl.java
            (Business Logic & List Operations)
                          |
        -----------------------------------------
        |            |          |              |
     Add Expense  Update     Delete      Calculate Total
        |            |          |              |
        -----------------------------------------
                          |
                          v
                    List<Expense>
               (In-Memory Data Storage)
                          |
                          v



✅ Add Expense


![image alt](https://github.com/pandeynidhi0210/Smart-Expense-Tracker-API/blob/6c8e19473e91a6945cd1f6ac1436906eb89f633d/Add_an_expense.png)



                          
                    Expense.java
        (id, title, amount, category, date)
