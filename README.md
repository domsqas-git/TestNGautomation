# TestNGautomation
TestNG automation challenge
OS: Windows 10 version 1903 --- 
Selenium server version 3.141.59 --- 
Eclipse: Eclipse Java 2018-12 64bit --- 
FireFox 68.0.1 64bit --- 
Google Chrome 76.0.3809.87 --- 
Download and install the Java Software Development Kit (JDK)(Latest version comes with JRE)from https://oracle.com Once installation is complete, open command prompt and type “java” --- 
Download latest version of "Eclipse IDE for Java Developers"(64 bit)from https://eclipse.org (Latest versions comes with TestNG. If you have an older version you have to download TestNG plugin from Eclipse Market place by clicking "Help". --- 
Double-click on exe file "eclipse-inst-win64" to Install the Eclipse Click Eclipse IDE for Java Developers Change path to "C:\eclipse" and drag it to "Install" button Click "Launch" ---
Download the Selenium Java Client Driver from https://seleniumhq.org Download comes as a ZIP file extract the contents of this ZIP file on your C drive so that you would have the directory "C:\selenium-. This directory contains all the JAR files --- 
Configure Eclipse IDE with WebDriver: Launch the "eclipse.exe" file inside the "eclipse" folder accept the default location.Create a new project through File- New- Java Project. Name the project as "newproject". On pop-up window will open enter details as follow; newproject - use default location- select an execution JRE- create separate folder for sources and class files- finish Right-click on the project we just created- Select New- Package, name the package as "newpackage"- nter the name of the package "newpackage"- finish Under the newpackage create a new Java class by right-clicking on it and then selecting- New > Class, and then name it as "MyClass". Finish Add JARs: Right-click on "newproject" and select Properties- click on "Java Build Path"- Click on the Libraries- Click on "Add External JARs.."- select the JAR files including the ones inside lib --- 
Install browsers driver (Chrome/FireFox-Mozilla Ghecko) from https://seleniumhq.org. Once unzipped copy and paste the file in your Selenium folder in "C" --- 
Now we start our project. --- 
//1.Test case: User open Chrome Browser. --- 
//2.Test case: User navigate to url: http://automationpractice.com/index.php . --- 
//3.Test case: User navigate to "Dresses" page by clicking on "Dress Tab" . --- 
//4.Test case: User choose and add 1st dress to cart and then click on Continue Shopping to go back to Dresses page. --- 
//5.Test case: User choose another Dress and adds it to cart and then click on Continue Shopping to go back to Dresses page. --- 
//6.Test case: User click on "More" on 3rd Dress, once in the dress page click to expand the picture and brows some.//Will close the picture and add the dress to cart. Will move away by clicking on Continue shopping and back to //Dresses page by clicking on "Dresses" on the path above picture. --- 
//7.Test case: User type in search box for Printed Summer Dress and enter. Will go to Summer Dresses page where// few dresses are available. Will pick the 4th and to cart. Will go to cart click on the dress that was just added and //will be taken back and perform change quantity to 3,choose a size and add to cart. Then will go back to Dresses page //by clicking on the "main" Dresses Tab. --- 
//8.Test case: User type "chiffon" in search box and click search button. Will click on the image and access to the//"chiffon" dress page. Change the color, send email to a friend (filling email address, friend name, but then will cancel)//Will add the 5th dress to cart, will go to shopping cart and delete an extra dress from cart. ---
//9.Test case: User contact the company through the "contact us" link. User send a message with the order reference //Then go back to "home page" by clicking "Back Home" button. --- 
//10.Test case: User sign up for an account. Will fill all of the info(note. I've have already register and it won't work //with the same email. I'm providing the script all you need to do is change a letter on the email). --- 
//11.Test case: User will go to cart and check out, click back on Shopping cart to confirm "cost of individual" dress order and "cost of total order" //(just the first 3 items are available for validation. the other 3 won't work). --- 
//12.Test case:User sign in and click on "forgot password". Will go back to Log in and type email/password. will click //on "Order history", and then click on the website "Logo" to return back to "home page" and "Sign out". //Session will CLOSE. ---
-----------
