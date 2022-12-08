DEMO: https://youtu.be/3-J-ifIlWvc

## Design
* We decided to build an application for a popular milk tea spot in San Jose called Gong-cha.
* The whole project is separated into four main division: three microservices and one backend RestAPI.
* The RestAPI is implemented and deployed On GKE beforehand for microservices to make use of.
* Each microservices is written within it's own folder and main running class, executing separately.
* However, all microservices shares the same MySQL database through the backend API for consistency.

# 

### 1. Cashier App

The Cashier App is used by the baristas to take in and process orders and their payments. This will call the CyberSource API to handle payments.

# 

### 2. Online Store

The Online Store manages customer data, such as user credentials, the user's card information, user's cart, and generating orders.

# 

### 3. Backoffice Help Desk

The Backoffice Help Desk is used by managers to change user's credentials.

# 

### 4. REST API

The REST API processes api calls to manage orders, customers, and cards, which will be called in the [Cashier App](###cashier-app), [Online Store](###online-store), and the [Backoffice Help Desk](###backoffice-help-desk).

# 

## How to Run: Local

NOTE: Clone the entire repository to a folder on your local machine before following these steps. The following steps runs the application locally. **ENSURE that Node.js is installed on your local machine.**

### Customer Microservice

1. Open the repository folder, navigate to `customer\`, and open a terminal at this location.

2. Run the commands `gradle build` and `gradle bootRun` to run the customer microservice.

### Order Microservice

1. Open the repository folder, navigate to `order\`, and open a terminal at this location.

2. Run the commands `gradle build` and `gradle bootRun` to run the order microservice.

## Payment Microservice

1. Open the repository folder, navigate to `payment\`, and open a terminal at this location.

2. Run the commands `gradle build` and `gradle bootRun` to run the payment microservice.

### Front Office

1. Open the repository folder, navigate to `frontend\`, and open a terminal at this location.

2. Run the command `npm install` (NOTE: you can skip warnings and npm audit).

3. In the terminal, navigate to `frontend\my-app\`, and run the command `npm install` (NOTE: you can skip warnings and npm audit).

4. In the terminal, run the command `npm start` to run the front-end app on the link [http://localhost:3000](http://localhost:3000)

NOTE: You will have 4 different terminals open

<!--
## How to Run: Docker

1. Follow the instructions in the [Payment Deployment readme file](payment/readme.md) to start up payment/.

2. Follow the instructions in the [Order Deployment readme file](order/readme.md) to start up order/.

3. Follow the instructions in the [Customer Deployment readme file](customer/readme.md) to start up customer/.

-->
## Journal

Although we don't have much journals, since our team was hectic (we had one of our teammates drop the class), we were able to get basic functionalities/bare minimum but we did struggle a lot with the back-end. Our team did it too last minute, so yes we shouldve started sooner.

## How the project should look like when you run it correctly

1. Sign up 
![sign up](https://user-images.githubusercontent.com/73457151/206386538-25371c7c-28da-47d3-bb20-95e5000d5a32.PNG)

2. Browse Catalog
![browse](https://user-images.githubusercontent.com/73457151/206386782-f4796680-6742-4c1a-ad9b-5db095c870e9.PNG)

3. Order/Payment Processing
![payment](https://user-images.githubusercontent.com/73457151/206387474-70133904-346e-4bb9-a292-8baa9fbd2799.PNG)
 
4. Help Desk
![passwordchange](https://user-images.githubusercontent.com/73457151/206388572-76432cc5-f954-4259-b6c5-3ffc42d71a32.PNG)

5. Employee login
![employee](https://user-images.githubusercontent.com/73457151/206388760-b1b0939c-6667-47f8-a5f7-1bd371e65767.PNG)


