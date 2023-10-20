# Bank Account Application

## Technologies used:
Java: Programming language

## Tools used:
Eclipse

## Project description:
In this project, I have played a role as a back-end developer and created an application that handles new customer 
bank account requests. I have carried out the following tasks in order to build this application:

1. Read a CSV file of names, social security numbers, account type, and initial deposit
2. Use a proper data structure to hold all these accounts
3. Both the savings and checking accounts share the following properties: 1. deposit() 2. withdraw() 3. transfer() 4.
showinfo() 5. 11-Digit Account Number (generated with the following process: 1 or 2 depending on Savings or
Checking, last two digit of SSN, unique 5-digit number, and random 3-digit number)
4. Savings Account holders are given a Safety Deposit Box, identified by a 3-digit number and accessed with a 4-
digit code
5. Checking Account holders are assigned a Debit Card with a 12-digit number and 4-digit PIN
6. Both accounts will use an interface that determines the base interest rate. Savings account will use 25 points less
than the base rate. Checking account will use 15% of the base rate
7. The Shownfo method should reveal relevant account information as well as information specific to the Checking
or Savings account
