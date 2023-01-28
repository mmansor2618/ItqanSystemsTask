This is a repo of the GUI task (Fatura)

using Maven, Data Driven Test, Page object model , TestNG

**INTRO **

This project is implemented using Page Object Model,under this model, for each web page in the application, there should be a corresponding Page Class This Page class will identify the WebElements of that web page and also contains Page methods which perform operations on those WebElements.There is a clean separation between test code and page specific code. for each web page there is a corresponding test page that can perform assertions on the website page.

This is a maven project you must download maven from marketplace to use it

Steps to use the project:

Download maven from marketplace clone the project or download it make sure that you install all jar file using maven dependices This project is implemented using Data-Driven Testing You can Edit test data of these test cases from config.properties from Configurations/config.properties

First Testcase

1.open home page : https://deliveroo.co.uk/ the link is saved at configuration file not hard coded

2. reach the search text box and add any valid post code or city like "Liverpool" the value is getting from configrutaion file not hardcoded

3-Select relevant result appear to you and  click enter

 I added asseration so i can compare the current URL with the expected URL

  Page Class: src/main/java/com/fatura/pages/SearchPage
            
  Test Class: src/test/java/com/fatura/testcases/SearchPageTest
  
  Second Testcase

1.open home page : https://deliveroo.co.uk/

2.reach the footer of the home page and click on FAQs

I added asseration so i can compare the current title of the page with the expected Title


  
  Page Class: src/main/java/com/fatura/pages/FAQsPage
            
  Test Class: src/test/java/com/fatura/testcases/FAQsPageTest

  

