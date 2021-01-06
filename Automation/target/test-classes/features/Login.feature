Feature: Application Login


Scenario: Home page default login
Given User is on NetBanking landing Page
When User login into application with "kushal" and password "12345"
Then Home Page is populated
And Cards are displayed are 'true'


Scenario: Home page default login
Given User is on NetBanking landing Page
When User login into application with "Lavish" and password "123456"
Then Home Page is populated
And Cards are displayed are 'false'
