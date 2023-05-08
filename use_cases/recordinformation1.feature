Feature: record information customers
  
  
  Scenario: to save  information customers
    Given : id,name,phone and address
    When the customer give id , name , phone and address 
    Then  successfull to save information
    Then  Failed to save information
 
      
      