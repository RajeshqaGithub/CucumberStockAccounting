Feature: validating ERP tests
@Supplierdata
Scenario Outline: Supplier creation Functionality Validation
When Open Browser
When Open Application
When Wait For Username with "name" and "username"
When Enter Username with "name" and "username"
When Enter Password with "id" and "password"
When Click On Login with "name" and "btnsubmit"
When Wait For Supplier with "xpath" and"//body/div[2]/div[2]/div[1]/div[1]/ul[1]/li[3]/a[1]"
When Click On Supplier with "xpath" and "//body/div[2]/div[2]/div[1]/div[1]/ul[1]/li[3]/a[1]"
When Wait For AddButton with "xpath" and "//body/div[2]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]"
When Click On AddButton with "xpath" and "//body/div[2]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]"
When Wait For SupplierNumber with "name" and "x_Supplier_Number"
Then Capture Data with "name" and "x_Supplier_Number"
When Wait For SupplierName with "name" and "x_Supplier_Name"
When Enter in "<SupplierName>" with "id" and "x_Supplier_Name" 
When Enter in "<address>" with "xpath" and "//*[@id='x_Address']" 
When Enter in "<city>" with "xpath" and "//*[@id='x_City']" 
When Enter in "<country>" with "xpath" and "//*[@id='x_Country']" 
When Enter in "<cperson>" with "xpath" and "//*[@id='x_Contact_Person']" 
When Enter in "<pnumber>" with "xpath" and "//*[@id='x_Phone_Number']" 
When Enter in "<mail>" with "xpath" and "//*[@id='x__Email']" 
When Enter in "<mnumber>" with "xpath" and "//*[@id='x_Mobile_Number']" 
When Enter in "<note>" with "xpath" and "//*[@id='x_Notes']" 
When Wait For Add Button with "id" and "btnAction"
When Click On Add Button after adding notes with "id" and "btnAction"
When Wait For Ok Button with "xpath" and "//button[contains(text(),'OK!')]"
When Click On Ok Button with "xpath" and "//button[contains(text(),'OK!')]"
When Wait For Alert with "xpath" and "//body/div[17]/div[2]/div[1]/div[4]/div[2]/button[1]"
When Click On Alert with "xpath" and "//body/div[17]/div[2]/div[1]/div[4]/div[2]/button[1]"
Then user validate the supplier table
When user closes the browser
Examples:
|SupplierName|address|city|country|cperson|pnumber|mail|mnumber|note|
|Rajesh1|SrNagar|Hyderabad|India|rajeshsamal|7077588698|test@gmail.com|8765432123|Supply testingkids|
|Rajesh5|Ameerpet|Hyderabad|India|rajeshsam|7077588692|selenium@gmail.com|8765432234|Supply testingkids|
|Rajesh8|SrNagar|Hyderabad|India|rajeshkumar|9876543232|cucumber@gmail.com|8765432345|Supply testingkids|
|Rajesh3|Ameerpet|Hyderabad|India|rajeshkusam|9876543231|hybrid@gmail.com|8765432456|Supply testingkids|
|Rajesh7|SrNagar|Hyderabad|India|rajeshsamku|9876543233|manual@gmail.com|8765432567|Supply testingkids|
|Rajesh9|Ameerpet|Hyderabad|India|rajeshsamal|9876543234|webdriver@gmail.com|8765432678|Supply testingkids|
|Rajesh2|SrNagar|Hyderabad|India|amRajrajesh|9876543235|driver@gmail.com|8765432136|Supply testingkids|
