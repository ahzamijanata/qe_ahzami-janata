# Test Case sepulsa.com

1. Test Scenario : Check the Login Functionality
    Test Case 1 : Enter valid email/handphone number and valid password
    Test Case 2 : Enter valid email/handphone number and invalid password
    Test Case 3 : Enter invalid email/handphone number and valid password
    Test Case 4 : Enter invalid email/handphone number and invalid password
    Test Case 5 : Login as a guest
    Test Case 6 : Login without filling any data

2. Test Scenario : Check the Forgot Email Functionality
    Test Case 1 : Enter valid email
    Test Case 2 : Enter invalid email

3. Test Scenario : Check the Create New Account Functionality
    Test Case 1 : Enter full name, valid email (not registered yet), valid phone number (not registered yet), valid password (Enter value in alphanumeric which is in between 8-32), and checklist the "I Agree" checkbox
    Test Case 2 : Register without filling any data
    Test Case 3 : Register with invalid email (not using domain)
    Test Case 4 : Register with valid email but already used
    Test Case 5 : Register with invalid phone number
    Test Case 6 : Register with valid phone number but already used
    Test Case 7 : Register with invalid password (the password length is >32 or <8)

4. Test Scenario : Buy Product
    Test Case 1 : pick a product
    Test Case 2 : enter valid handphone number
    Test Case 3 : enter invalid phone number

5. Test Scenario : Choose Payment Method
    Test Case 1 : Check if each of the payment options is selectable.
    Test Case 2 : Check if the user gets a confirmation message or mail if the payment is successful.
    Test Case 3 : Choose a "must login payment method" with login as a guest.

