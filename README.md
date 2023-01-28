This is a repo of the GUI task (ItqanSystems)

using Maven, Data Driven Test, Page object model , TestNG

**INTRO **

This project is implemented using Page Object Model,under this model, for each web page in the application, there should be a corresponding Page Class This Page class will identify the WebElements of that web page and also contains Page methods which perform operations on those WebElements.There is a clean separation between test code and page specific code. for each web page there is a corresponding test page that can perform assertions on the website page.

This is a maven project you must download maven from marketplace to use it

Steps to use the project:

Download maven from marketplace clone the project or download it make sure that you install all jar file using maven dependices This project is implemented using Data-Driven Testing You can Edit test data of these test cases from config.properties from Configurations/config.properties

First Testcase

1- open home page : http://magento-demo.lexiconn.com/ the link is saved at configuration file not hard coded
2- Go to “ACCOUNT” page
3- Click on “Register” form

 I added asseration so i can compare the current Title with the expected Title

  Page Class: src/main/java/com/Itqan/pages/HomePage
            
  Test Class: src/test/java/com/Itqan/testcases/HomePageTest
  
  Second Testcase

1- open home page : http://magento-demo.lexiconn.com/ the link is saved at configuration file not hard coded
2- Go to “ACCOUNT” page
3- Click on “Register” form
4-Fill form data then click on “REGISTER” button

I added asseration so i can compare the current title of the page with the expected Title and current URL with Expected URL


  
  Page Class: src/main/java/com/Itqan/pages/SignupPage
            
  Test Class: src/test/java/com/Itqan/testcases/SignupPageTest

  

