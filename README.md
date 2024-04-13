
# Pharmacy Management System

The Pharmacy Management System is a Java-based application built using Java Swing (JFrames) on Apache NetBeans IDE. This system aims to streamline and automate various tasks involved in managing a pharmacy, including inventory management, sales tracking, prescription management, and more.

It uses MySQL database for storing the data. This data majorly includes the details about the Admins and Pharmacists who are going to use it, and about the medicine records and their sells racords.

An Admin can control the Pharmacists details and can preview the medicine and sells records. A pharmacist have the access of editing the medicine details and creating and managing the bills. 


## Features

- User Authentication: Secure login system to ensure only authorized personnel can access the system.
- Inventory Management: Keep track of available medicines, their quantities, and price per unit.
- Sales Tracking: Record and manage sales transactions, including generating invoices/receipts.
- Reporting: Generate reports on sales, inventory, and other relevant metrics to facilitate decision-making.
- User-Friendly Interface: Intuitive and easy-to-use graphical interface built using Java Swing components.


## Installation

First off, Download Apache Netbeans IDE. NetBeans is an integrated development environment for Java. NetBeans allows applications to be developed from a set of modular software components called modules.

NetBeans Download Link - https://netbeans.apache.org/front/main/download/

Next, you have install Java version 11, as the latest Java versions do not support applet programming.

Java version 11 - https://www.oracle.com/in/java/technologies/javase/jdk11-archive-downloads.html

Now, download the MySQl Database.

MySQl Installer - https://dev.mysql.com/downloads/installer/

    
## Database 

Create the database named as 'pharmacy'. And add the below given tables:

Table 1 - appuser
```bash
  CREATE TABLE appuser(appuser_pk INT AUTO_INCREMENT PRIMARY KEY, UserRole VARCHAR(100), Name VARCHAR(200), DOB VARCHAR(50), PhoneNo VARCHAR(50), Email VARCHAR(200), Username VARCHAR(200), Password VARCHAR(50), Address VARCHAR(200))
```

Table 2 - medicine
```bash
    CREATE TABLE medicine(medicine_pk INT AUTO_INCREMENT PRIMARY KEY, uniqueID VARCHAR(200), name VARCHAR(200), companyName VARCHAR(200), quantity BIGINT, price BIGINT
```

Table 3 - bill
```bash
    CREATE TABLE bill(bill_pk INT AUTO_INCREMENT PRIMARY KEY, billID VARCHAR(200), billDate VARCHAR(200), totalPaid BIGINT, generatedBy VARCHAR(50))
```

Now add a entry in appuser in order to login the application:
```bash
    INSERT INTO appuser(UserRole, Name, DOB, PhoneNo, Email, Username, Password, Address) VALUES('Admin', 'Prathmesh', '05-08-2004', '7414959307', 'salunkheprathmesh0@gmail.com', 'Admin-Prathmesh', '12345678', 'Satara')
```




## Run Locally

Clone the project

Open the project directory in NetBeans IDE.

Go to src -> defaultpackages -> login.java 

Run the file by right clicking on it and selecting Run option.



## Screenshots

![Login](https://github.com/prathmesh796/Pharmacy-management-system/blob/main/ss/Screenshot%202024-04-13%20191935.png)

![Admin DashBoard](https://github.com/prathmesh796/Pharmacy-management-system/blob/main/ss/Screenshot%202024-04-13%20191957.png)

![Pharmacist DashBoard](https://github.com/prathmesh796/Pharmacy-management-system/blob/main/ss/Screenshot%202024-04-13%20192020.png)

![Sell Med](https://github.com/prathmesh796/Pharmacy-management-system/blob/main/ss/Screenshot%202024-04-13%20192032.png)

![View Bill](https://github.com/prathmesh796/Pharmacy-management-system/blob/main/ss/Screenshot%202024-04-13%20192059.png)

![Bill](https://github.com/prathmesh796/Pharmacy-management-system/blob/main/ss/Screenshot%202024-04-13%20192216.png)

