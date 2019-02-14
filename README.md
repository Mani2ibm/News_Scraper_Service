# News_Scraper_Service(NSS)
News Scraper Service is to scrap articles data from https://www.thehindu.com/archive/


Running News_Scraper_Service(NSS) locally


NSS is a Spring Boot application built using Maven. You can build a jar file and run it from the command line:
git clone https://github.com/Mani2ibm/News_Scraper_Service.git
cd News_Scraper_Service
./mvnw package
java -jar target/*.jar

You can then access NSS here: http://localhost:8080/

 or you can run it from Maven directly using the Spring Boot Maven plugin. If you do this it will pick up changes that you make in the project immediately (changes to Java source files require a compile as well - most people use an IDE for this):
 ./mvnw spring-boot:run
 
Working with Petclinic in your IDE
Prerequisites
The following items should be installed in your system:

Java 8 or newer.

git command line tool (https://help.github.com/articles/set-up-git)
Your prefered IDE
Eclipse with the m2e plugin. Note: when m2e is available, there is an m2 icon in Help -> About dialog. If m2e is not there, just follow the install process here: http://www.eclipse.org/m2e/
Spring Tools Suite (STS)
Steps:
On the command line
git clone https://github.com/Mani2ibm/News_Scraper_Service.git
Inside Eclipse or STS
File -> Import -> Maven -> Existing Maven project -> Select News_Scraper_Service
Then either build on the command line ./mvnw generate-resources or using the Eclipse launcher (right click on project and Run As -> Maven install) to generate the css. Run the application main method by right clicking on it and choosing Run As -> Java Application.


Navigate to News_Scraper_Service
Visit http://localhost:8080 in your browser.
