# Part 3: Reflection on the automation exercise


### Explain the following

1. In terms of the different testing categories that describe the scope of the test,
   how would you describe the type of test you have just written?
   
    
- System testing, in this case Ichecked whether user is able to book the tour without any issue.
     For the Scope, I'm only using a positive testing or "happy path".
   
2. Outline the possibilities of automating these specific test cases in different scopes, together with a short summary of the pros and cons of each of them.


- **Scope 1: Integration testing:**
  
    **Pros**: These types of tests are helpful when you need to fetch some values from backend and see if they are correcly reflected on front end,in this scenarion we can check the prices.
    
    **Cons**: Early prototype is not possible.


- **Scope 2: Functional testing / Error approach:**
    
    **Pros**: For this scope you can verify if the front end works as expected using different techniques (positive/negative scenarios).
  You can have different scenarios using the acceptance criteria.
  
    **Cons**:You can have a lot of scenarios and are might be difficult to cover.
  

- **Scope 3: End-to-end testing:**
    
    **Pros**: You can quickly do a health check of an application by testing imporatnt ene to end functionality.
  
    **Cons**: Big application can have lot of imporatnt e2e scenarios which will be ultimately a lot to test.

