# Smart-Expense-Tracker-API



Step 1

Create Spring Boot Project

Dependencies

Purpose	          Correct Dependency
Validation	      spring-boot-starter-validation ✅
Web (REST API)	  spring-boot-starter-web ✅ (not spring-boot-starter-webmvc)
DevTools	        spring-boot-devtools ✅
Testing  	        spring-boot-starter-test ✅ (not spring-boot-starter-validation-test or spring-boot-starter-webmvc-test)





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
