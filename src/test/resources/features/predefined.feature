@predefined
Feature: Smoke steps

  @predefined1
  Scenario: Predefined steps for Google
    Given I open url "https://google.com"
    Then I should see page title as "Google"
    Then element with xpath "//textarea[@name='q']" should be present
    When I type "Behavior Driven Development" into element with xpath "//textarea[@name='q']"
    When I click on element using JavaScript with xpath "(//input[@name='btnK'])[1]"
    When I wait for element with xpath "//*[@id='res']" to be present
    Then element with xpath "//*[@id='res']" should contain text "Cucumber"
    And I say hello world

  @predefined2
  Scenario: Predefined steps for Bing
    Given I open url "https://www.bing.com/"
    Then I should see page title as "Bing"
    Then element with xpath "//textarea[@id='sb_form_q']" should be present
    When I type "Behavior Driven Development" into element with xpath "//textarea[@id='sb_form_q']"
    When I wait for element with xpath "//label[@id='search_icon']" to be present
    When I click on element using JavaScript with xpath "//label[@id='search_icon']"
    When I wait for element with xpath "//ol[@id='b_results']" to be present
    Then element with xpath "//ol[@id='b_results']" should contain text "Cucumber"


  @predefined3
  Scenario: Predefined steps for Ecosia
    Given I open url "https://www.ecosia.org/"
     #And I am "admin"
    Then I should see page title contains "Ecosia"
    When I type "Behavior Driven Development" into element with xpath "//input[@data-test-id='search-form-input']"
    And I click on element with xpath "//button[@data-test-id='search-form-submit']"

  @predefined3
  Scenario: Predefined steps for Yahoo
    Given I open url "https://www.yahoo.com"
    Then I should see page title contains "Yahoo"
    Then element with xpath "//input[@id='uh-search-box']" should be present
    When I type "Behavior Driven Development" into element with xpath "//input[@id='uh-search-box']"
    Then I click on element using JavaScript with xpath "//button[@id='uh-search-button']"
    Then I wait for element with xpath "//div[@id='bd']" to be present
    Then element with xpath "//div[@id='bd']" should contain text "Cucumber"

  @predefined4
  Scenario: Steps for Gibiru
    Given I open url "http://gibiru.com"
    Then I should see page title contains "Gibiru"
    Then element with xpath "//input[@id='q']" should be present
    When I type "Behavior Driven Development" into element with xpath "//input[@id='q']"
    Then I click on element using JavaScript with xpath "//i[@class='fas fa-search new']"
    Then I wait for element with xpath "//*[@id='web-results']" to be present
    Then element with xpath "//*[@id='web-results']" should contain text "Cucumber"

  @predefined5
  Scenario: Steps for Duckduckgo
    Given I open url "https://duckduckgo.com"
    Then I should see page title contains "DuckDuckGo"
    Then element with xpath "//input[@id='search_form_input_homepage']" should be present
    When I type "Behavior Driven Development" into element with xpath "//input[@id='search_form_input_homepage']"
    Then I click on element using JavaScript with xpath "//input[@id='search_button_homepage']"
    Then I wait for element with xpath "//div[contains(@class,'results--main')]" to be present
    Then element with xpath "//div[contains(@class,'results--main')]" should contain text "Cucumber"

  @predefined6 @smoke @regression
  Scenario: Steps for Swisscows
    Given I open url "https://swisscows.com"
    Then I should see page title contains "Swisscows"
    Then element with xpath "//input[@name='query']" should be present
    When I type "Behavior Driven Development" into element with xpath "//input[@name='query']"
    Then I click on element using JavaScript with xpath "//button[@class='search-submit']"
    #Then I wait for element with xpath "//div[@class='web-results']" to be present
    When I wait for element with xpath "//article" to be present
    Then element with xpath "//div[@class='web-results']" should contain text "Cucumber"

  @predefined7
  Scenario: Steps for Searchencrypt
    Given I open url "https://www.searchencrypt.com"
    Then I should see page title contains "Search Encrypt"
    Then element with xpath "//div[@class='col-md-12 text-center']//input[@placeholder='Search...']" should be present
    When I type "Behavior Driven Development" into element with xpath "//div[@class='col-md-12 text-center']//input[@placeholder='Search...']"
    Then I click on element using JavaScript with xpath "//button[@id='btn-secure-search']"
    Then I wait for element with xpath "//div[@id='results-list']" to be present
    Then element with xpath "//div[@id='results-list']" should contain text "Cucumber"

  @predefined8
  Scenario: Steps for Startpage
    Given I open url "https://www.startpage.com"
    Then I should see page title contains "Startpage"
    Then element with xpath "//input[@id='query']" should be present
    When I type "Behavior Driven Development" into element with xpath "//input[@id='query']"
    Then I click on element using JavaScript with xpath "//button[@class='search-form__button']"
    Then I wait for element with xpath "//html//body" to be present
    Then element with xpath "//html//body" should contain text "Cucumber"

  @predefined9
  Scenario: Steps for Yandex
    Given I open url "https://www.yandex.com"
    Then I should see page title contains "Yandex"
    Then element with xpath "//input[@id='text']" should be present
    When I type "Behavior Driven Development" into element with xpath "//input[@id='text']"
    Then I click on element using JavaScript with xpath "//button[@type='submit']"
    Then I wait for element with xpath "//div[@class='content__left']" to be present
    Then element with xpath "//div[@class='content__left']" should contain text "Cucumber"

  @predefined10
  Scenario: Steps for Boardreader
    Given I open url "http://boardreader.com"
    Then I should see page title contains "Boardreader"
    Then element with xpath "//input[@id='title-query']" should be present
    When I type "Behavior Driven Development" into element with xpath "//input[@id='title-query']"
    Then I click on element using JavaScript with xpath "//button[@id='title-submit']"
    Then I wait for element with xpath "//div[@class='mdl-cell mdl-cell--12-col searchResultsBlock']" to be present
    Then element with xpath "//div[@class='mdl-cell mdl-cell--12-col searchResultsBlock']" should contain text "Cucumber"

  @predefined11
  Scenario: Steps for Ecosia
    Given I open url "https://www.ecosia.org/"
    Then I should see page title contains "Ecosia"
    Then element with xpath "//input[@name='q']" should be present
    When I type "Behavior Driven Development" into element with xpath "//input[@name='q']"
    Then I click on element using JavaScript with xpath "//button[@type='submit']"
    Then I wait for element with xpath "//div[@class='mainline-results']" to be present
    Then element with xpath "//div[@class='mainline-results']" should contain text "Cucumber"

  @predefined12
  Scenario: Steps for Yahoo Australia
    Given I open url "http://au.yahoo.com/"
    When I maximize window
    When I click on element with xpath "//input[@id='ybar-sbq']"
    #Then I should see page title contains "Yahoo Australia"
    When I type "Behavior Driven Development" into element with xpath "//input[@id='ybar-sbq']"
    When I click on element with xpath "//button[@id='ybar-search']"
    When I wait for element with xpath "//div[@id='web']" to be present
    Then element with xpath "//div[@id='web']" should contain text "Cucumber"

#  @passwords
#  Scenario: Password field testing - Passwords do not match
#    Given I open quote page
#    When I type "Pass1" in password and "Pass2" in confirm password fields
#    Then I see error "Passwords do not match"
#
#  Scenario: Password field testing - Passwords match
#    Given I open quote page
#    When I type "abcde!" in password and "abscde!" in confirm password fields
#    Then I do not see error

  @predefined12
  Scenario: Predefined steps for Google2
    Given I go to google
    When I maximize window
    Then I should see page title as "Google"
    Then element with xpath "//textarea[@name='q']" should be present
    When I type "Behavior Driven Development" into element with xpath "//textarea[@name='q']"
    When I click on element using JavaScript with xpath "(//input[@name='btnK'])[1]"
    When I wait for element with xpath "//*[@id='res']" to be present
    Then element with xpath "//*[@id='res']" should contain text "Cucumber"

  @quote1 @quote
  Scenario: Responsive UI
    Given I open url "https://skryabin.com/market/quote.html"
    When I resize window to 1280 and 1024
    Then element with xpath "//b[@id='location']" should be displayed
    When I resize window to 1000 and 1024
    Then element with xpath "//b[@id='location']" should be displayed
    When I resize window to 400 and 1024
    Then element with xpath "//b[@id='location']" should not be displayed
    When I resize window to 1280 and 1024

  @quote2 @quote
  Scenario: Username field validation - error message
    Given I open url "https://skryabin.com/market/quote.html"
    When I type "1" into element with xpath "//input[@name='username']"
    And I click on element with xpath "//button[@id='formSubmit']"
    Then element with xpath "//label[@id='username-error']" should be displayed
    When I type "2" into element with xpath "//input[@name='username']"
    Then element with xpath "//label[@id='username-error']" should not be displayed

  @quote3 @quote
  Scenario: Validate Email field
    #invalid email
    Given I open url "https://skryabin.com/market/quote.html"
    When I type "polinashever" into element with xpath "//input[@name='email']"
    When I click on element with xpath "//button[@id='formSubmit']"
    Then element with xpath "//label[@id='email-error']" should contain text "Please enter a valid email"
    When I clear element with xpath "//input[@name='email']"
      #valid email
    When I type "polinashever@gmail.com" into element with xpath "//input[@name='email']"
    Then element with xpath "//label[@id='email-error']" should not be displayed

  @quote4 @quote
  Scenario: Verify Password field
    Given I open url "https://skryabin.com/market/quote.html"
    Then element with xpath "//input[@name='confirmPassword']" should be disabled
    Then element with xpath "//input[@id='password']" should have attribute "value" as ""
    #gets enabled
    When I type "test1" into element with xpath "//input[@id='password']"
    #When I wait for 10 sec
    Then element with xpath "//input[@name='confirmPassword']" should be enabled

  @quote5 @quote
  Scenario: Verify "Name" dialog is shown when user clicks on "Name" field
    Given I open url "https://skryabin.com/market/quote.html"
    When I click on element with xpath "//input[@id='name']"
    Then element with xpath "//div[@id='nameDialog']" should be displayed
    When I type "Name" into element with xpath "//input[@id='firstName']"
    And I type "Surname" into element with xpath "//input[@id='lastName']"
    And I click on element with xpath "//span[text()='Save']"
    Then element with xpath "//input[@id='name']" should have attribute "value" as "Name Surname"

  @quote6 @quote
  Scenario: Validate that Accepting Privacy Policy is required
    Given I open url "https://skryabin.com/market/quote.html"
    When I click on element with xpath "//input[@id='name']"
    When I type "Name" into element with xpath "//input[@id='firstName']"
    And I type "Surname" into element with xpath "//input[@id='lastName']"
    And I click on element with xpath "//span[text()='Save']"
    When I type "Username1" into element with xpath "//input[@name='username']"
    When I type "test@email.com" into element with xpath "//input[@name='email']"
    When I type "test1" into element with xpath "//input[@id='password']"
    When I type "test1" into element with xpath "//input[@name='confirmPassword']"
    And I click on element with xpath "//button[@id='formSubmit']"
    Then I should see page title contains "Get a Quote"
    And element with xpath "//label[@id='agreedToPrivacyPolicy-error']" should have text as "- Must check!"
    When I click on element with xpath "//input[@name='agreedToPrivacyPolicy']"
    Then element with xpath "//label[@id='agreedToPrivacyPolicy-error']" should not have text as "- Must check!"
    When I click on element with xpath "//button[@id='formSubmit']"
    Then element with xpath "//legend[@class='applicationResult']" should have text as "Submitted Application"

  @quote7 @quote
  Scenario: Verify Confirm Password field's error - Passwords do not match
    Given I open url "https://skryabin.com/market/quote.html"
    When I type "test1" into element with xpath "//input[@id='password']"
    And I type "test2" into element with xpath "//input[@name='confirmPassword']"
    And I click on element with xpath "//button[@id='formSubmit']"
    Then element with xpath "//label[@id='confirmPassword-error']" should contain text "Passwords do not match"
    When I clear element with xpath "//input[@name='confirmPassword']"
    #no error - same password
    When I type "test1" into element with xpath "//input[@name='confirmPassword']"
    Then element with xpath "//label[@id='confirmPassword-error']" should not be displayed

  @quote8 @quote @end-to-end
  Scenario: Verify the input is saved correctly and Password is not displayed
    Given I open url "https://skryabin.com/market/quote.html"
    When I type "Name Last" into element with xpath "//input[@id='name']"
    When I click on element using JavaScript with xpath "//select[@name='countryOfOrigin']"
    And I click on element with xpath "//option[contains(@value,'China')]"
    When I click on element with xpath "//textarea[@name='address']"
    When I wait for element with xpath "//textarea[@name='address']" to be present
    When I type "23 Elm St" into element with xpath "//textarea[@name='address']"
    When I type "Username" into element with xpath "//input[@name='username']"
    When I type "test@email.com" into element with xpath "//input[@name='email']"
    When I type "test1" into element with xpath "//input[@id='password']"
    And I type "test1" into element with xpath "//input[@name='confirmPassword']"
    When I type "1234567" into element with xpath "//input[@name='phone']"
    #steps for calendar
    When I type "07/12/1986" into element with xpath "//input[@id='dateOfBirth']"
    When I click on element with xpath "//input[@value='female']"
    And I click on element using JavaScript with xpath "//input[@name='allowedToContact']"
    When I click on element with xpath "//option[@value='Toyota']"
    When I click on element with xpath "//input[@name='agreedToPrivacyPolicy']"
    When I click on element using JavaScript with xpath "//button[@id='formSubmit']"
    When I wait for element with xpath "//div[@id='quotePageResult']" to be visible

    Then element with xpath "//legend[@class='applicationResult']" should have text as "Submitted Application"
    Then element with xpath "//legend[@class='applicationResult']" should contain text "Submitted Application"
    Then element with xpath "//div[@id='quotePageResult']" should contain text "07/12/1986"
    #submit form
    Then element with xpath "//b[@name='dateOfBirth']" should have text as "07/12/1986"
    And element with xpath "//b[@name='username']" should have text as "Username"
    And element with xpath "//b[@name='allowedToContact']" should have text as "true"
    And element with xpath "//b[@name='password']" should have text as "[entered]"
    And element with xpath "//b[@name='name']" should have text as "Name Last"
    And element with xpath "//b[@name='gender']" should have text as "female"
    And element with xpath "//b[@name='phone']" should have text as "1234567"
    And element with xpath "//b[@name='agreedToPrivacyPolicy']" should have text as "true"
    And element with xpath "//b[@name='email']" should have text as "test@email.com"
    And element with xpath "//b[@name='address']" should contain text "23 Elm St"
    When I write another java step with argument "end-to-end is done"
  @quote9 @quote
  Scenario: Verify 3rd party
    Given I open url "https://skryabin.com/market/quote.html"
    When I click on element with xpath "//button[@id='thirdPartyButton']"
    When I accept alert
    Then element with xpath "//input[@id='thirdPartyAgreement']" should have attribute "value" as "accepted"

    When I click on element with xpath "//button[@id='thirdPartyButton']"
    And I dismiss alert
    Then element with xpath "//input[@id='thirdPartyAgreement']" should have attribute "value" as "declined"

  @quote10 @quote
  Scenario: Verify Email's error for max allowed length valid email - 92
    Given I open url "https://skryabin.com/market/quote.html"
    When I type "ewrfjerhfiujerhfrweytrqwtyer@ygduygsdcyughjsadgdgvcyudgfvyucgfeyuvgyudgvyurgvyurgdyuvgeyuvgyuefrgewi" into element with xpath "//input[@name='email']"
    When I wait for 10 sec
    Then element with xpath "//label[@id='email-error']" should contain text "Please enter a valid email"

  @quote11 @quote
  Scenario: Verify required fields
    Given I open url "https://skryabin.com/market/quote.html"
    When I click on element with xpath "//button[@id='formSubmit']"
    Then element with xpath "//label[@id='name-error']" should contain text "This field is required"
    Then element with xpath "//label[@id='username-error']" should contain text "This field is required"
    Then element with xpath "//label[@id='password-error']" should contain text "This field is required"
    Then element with xpath "//label[@id='email-error']" should contain text "This field is required"

  @quote12 @quote
  Scenario: Verify required fields disappear for the Name field (bug)
    Given I open url "https://skryabin.com/market/quote.html"
    When I click on element with xpath "//button[@id='formSubmit']"
    When I click on element with xpath "//input[@id='name']"
    When I type "Name" into element with xpath "//input[@id='firstName']"
    And I type "Surname" into element with xpath "//input[@id='lastName']"
    And I click on element with xpath "//span[text()='Save']"
    Then element with xpath "//input[@id='name']" should have attribute "value" as "Name Surname"
    Then element with xpath "//label[@id='name-error']" should not be displayed

  @quote13 @quote
  Scenario: Verify Vide documents link
    Given I open url "https://skryabin.com/market/quote.html"
    When I click on element with xpath "//a[@id='link']"
    When I switch to new window
    Then I should see page title as "Documents Page"

  @quote14 @quote
  Scenario: Related documents button
    Given I open url "https://skryabin.com/market/quote.html"
    When I click on element using JavaScript with xpath "//button[contains(text(),'Related documents')]"
    When I switch to new window
    When I wait for element with xpath "//h4[normalize-space()='Documents List:']" to be present
    Then I should see page title as "Documents Page"

  @quote15 @quote
  Scenario: Verify iFrame
    Given I open url "https://skryabin.com/market/quote.html"
    When I type "Name Last" into element with xpath "//input[@id='name']"
    When I type "Username" into element with xpath "//input[@name='username']"
    When I type "test@email.com" into element with xpath "//input[@name='email']"
    When I type "test1" into element with xpath "//input[@id='password']"
    And I type "test1" into element with xpath "//input[@name='confirmPassword']"
    When I type "1234567" into element with xpath "//input[@name='phone']"
    When I switch to iframe with xpath "//iframe[@onmouseover='iframeHover()']"
    And I type "Teresa" into element with xpath "//input[@id='contactPersonName']"
    And I type "May" into element with xpath "//input[@id='contactPersonPhone']"
    When I switch to first window
    When I click on element with xpath "//input[@name='agreedToPrivacyPolicy']"
    When I click on element using JavaScript with xpath "//button[@id='formSubmit']"
    When I wait for element with xpath "<string>" to be present
    Then element with xpath "//legend[@class='applicationResult']" should have text as "Submitted Application"
    And element with xpath "//b[@name='contactPersonName']" should contain text "Teresa"
    And element with xpath "//b[@name='contactPersonPhone']" should contain text "May"

  #steps for calendar
  @quote16 @quote @calendar
  Scenario: Verify "DateOfBirth" date picker
    Given I open url "https://skryabin.com/market/quote.html"
    When I click on element with xpath "//input[@id='dateOfBirth']"
    And I click on element with xpath "//select[@data-handler='selectYear']"
    When I wait for element with xpath "//option[@value='1986']" to be present
    And I click on element using JavaScript with xpath "//option[@value='1986']"
    And I click on element with xpath "//select[@data-handler='selectMonth']"
    And I click on element with xpath "//option[@value='6']"
    And I click on element with xpath "//a[text()='3']"
    Then element with xpath "//input[@id='dateOfBirth']" should have attribute "value" as "05/03/1986"

  @quote17 @quote
  Scenario: Verify file upload
    Given I open url "https://skryabin.com/market/quote.html"
    When I type "C:\Users\polina\OneDrive\Documents\Personal\codewars.txt" into element with xpath "//input[@id='attachment']"
    Then element with xpath "//input[@id='attachment']" should have attribute "class" as "ng-pristine ng-valid ng-touched valid"

    #steps for calendar
  @uote18 @quote @calendar
  Scenario: Verify calendar
    Given I open url "https://skryabin.com/market/quote.html"
    When I click on element with xpath "//input[@id='dateOfBirth']"
    When I click on element with xpath "//select[@data-handler='selectMonth']/option[11]"
    And I click on element with xpath "//select[@data-handler='selectYear']/option[@value='1980']"
    And I click on element with xpath "//td[@data-handler='selectDay']/a[text()='7']"
    Then element with xpath "//input[@id='dateOfBirth']" should have attribute "value" as "11/07/1980"

    @quote19 @quote @calendar
    Scenario: Verify arrows selectors
    Given I open url "https://skryabin.com/market/quote.html"
      When I click on element with xpath "//input[@id='dateOfBirth']"
      When element with xpath "//select[@data-handler='selectMonth']/option[1]" should have attribute "selected" as "true"
      When I click on element with xpath "//a[@data-handler='prev']"
      Then element with xpath "//select[@data-handler='selectMonth']/option[12]" should have attribute "selected" as "true"
      
      When I click on element with xpath "//a[@data-handler='next']"
      Then element with xpath "//select[@data-handler='selectMonth']/option[1]" should have attribute "selected" as "true"

  @predefined13
  Scenario: Predefined steps for Metabot title
    Given I open url "https://www.metabot.ru/"
    Then I should see page title contains " MetaBot.ru - Мощнейшая российская мета-поисковая система!"

  @thinkingTester1
  Scenario: Page Title Verification
    Given I open url "https://thinking-tester-contact-list.herokuapp.com/"
    Then I should see page title as "Contact List App"

  @thinkingTester2
  Scenario: Verify succesfull login
    Given I open url "https://thinking-tester-contact-list.herokuapp.com/"
    When I type "polinashever4@gmail.com" into element with xpath "//input[@id='email']"
    And I type "1234567" into element with xpath "//input[@id='password']"
    And I click on element with xpath "//*[@id='submit']"
    And I wait for element with xpath "//div[@class='main-content']" to be present
    Then element with xpath "//div[@class='main-content']" should be displayed

  @thinkingTester3
  Scenario: Verify unsuccessful login with invalid email
    Given I open url "https://thinking-tester-contact-list.herokuapp.com/"
    When I type "polinashever5@gmail.com" into element with xpath "//input[@id='email']"
    And I type "1234567" into element with xpath "//input[@id='password']"
    And I click on element with xpath "//*[@id='submit']"
    And I wait for element with xpath "//span[@id='error']" to be present
    Then element with xpath "//span[@id='error']" should be displayed

  @thinkingTester4
  Scenario: Verify unsuccessful login with invalid password
    Given I open url "https://thinking-tester-contact-list.herokuapp.com/"
    When I type "polinashever4@gmail.com" into element with xpath "//input[@id='email']"
    And I type "1234568" into element with xpath "//input[@id='password']"
    And I click on element with xpath "//*[@id='submit']"
    And I wait for element with xpath "//span[@id='error']" to be present
    Then element with xpath "//*[@id='error']" should be displayed

  @predefined14
  Scenario: Predefined steps for Ebay
    Given I open url "https://www.ebay.com/"
    When I mouse over element with xpath "//*[@data-hover-track='p4375194.m1380.l6435']"
    And I click on element using JavaScript with xpath "//*[@_sp='p4375194.m1380.l3252']"
    And I wait for element with xpath "//*[@id='leftnav']" to be present
    Then element with xpath "//*[@id='leftnav']" should contain text "Camera Drones"

    When I type "phone" into element with xpath "//*[@id='gh-ac']"
    And I click on element with xpath "//*[@id='gh-btn']"
    Then element with xpath "//*[@id='mainContent']" should contain text "iPhone"
    When I wait for 5 sec

    When I click on element using JavaScript with xpath "//a[@_sp='m570.l1524']"
    And I wait for element with xpath "//input[@id='userid']" to be present
    Then element with xpath "//*[@id='signin-reg-msg']" should be displayed

  @ebay1 @ebay
  Scenario: Ebay
    Given I open url "https://www.ebay.com/"
    When I type "coverstich" into element with xpath "//input[@aria-label='Search for anything']"
    When I click on element with xpath "//input[@id='gh-btn']"
    When I click on element with xpath "//span[text() = 'Price + Shipping: lowest first']"



#  Scenario: Login - Valid Email/Password
#    Given I navigate to "login" page
#    And I type email "xjnrdnpathake@b4top.tk" on "login" page
#    And I type password "12345" on "login" page
#    And I click Sign in button
#    Then I verify user name "Leslie Teacher" is displayed
