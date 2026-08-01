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
       Expense.java
        (id, title, amount, category, date)


✅ Add Expense


![image alt](https://github.com/pandeynidhi0210/Smart-Expense-Tracker-API/blob/6c8e19473e91a6945cd1f6ac1436906eb89f633d/Add_an_expense.png)



 ✅ Get All Expenses


 ![image alt](https://github.com/pandeynidhi0210/Smart-Expense-Tracker-API/blob/0fc576bf241952ee0879447b858e9da11a3500ab/View_all_expenses.png)
                    

✅ Get Expenses By ID
 
 
 ![image alt](https://github.com/pandeynidhi0210/Smart-Expense-Tracker-API/blob/66358510980b069218c67802c0d219c4b05d73ce/View_expenses_by_ID.png)


 ✅ Filter by Category


 ![image alt](https://github.com/pandeynidhi0210/Smart-Expense-Tracker-API/blob/9088f8de43a1ba7540e795289dcbb714a2b89caa/Filter_expenses_by_Category.png)


 ✅ Calculate Total Expenses


 ![image alt]()


 ✅ Calculate Total by Category


 ![image alt]()


 ✅ Delete Expense


 ![image alt]()


 
 
