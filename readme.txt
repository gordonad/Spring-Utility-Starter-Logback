*********************************
* Simple Spring Utility Project *
*********************************
  by: Gordon Dickens
  mail: gordon@gordondickens.com
  Created: 14-Jun-2011
*********************************

Features:
--------
* Support for Maven 2.2.x - 3.0.x
* Logback/SLF4J for logging only... JCL (jakarta commons logging) and
    JUL (java.util.logging) are all routed through Logback configuration
* All Maven plugins are configured with their current versions
    as of 14-Jun-2011 for Maven 3.0.3
* All version numbers are in properties section of pom file
* Enables Spring discovery of @Component
* Sample JUnit test
* Enforces Java & Maven versions
* Banned Dependency "commons-logging"
* Eclipse & IntelliJ IDEA plugins


Important Files:
---------------
* pom.xml - Maven configuration file
* src/main/resources/logback.xml - configuration file for logging src code
* src/main/resources/META-INF/spring/app-context.xml - Spring context config
* src/main/java/com/chariot/simpleutil/AppRunner.java - Sample Java App
* src/test/resources/logback-test.xml - configuration file for logging test code
* src/test/java/com/chariot/simpleutil/ExampleServiceTests.java - Sample
     Spring JUnit test with Logging
* src/test/resources/com/chariot/simpleutil/ExampleServiceTests-context.xml -
     Spring context configuration for ExampleServiceTests.java

Building Eclipse/STS project from command prompt:
------------------------------------------------
   mvn eclipse:eclipse

Building IntelliJ IDEA project from command prompt:
--------------------------------------------------
   mvn idea:idea

Building the Project from command prompt:
--------------------
   mvn clean install

STS Tips:
--------
* Right click on project > Maven > Enable Dependency Management
* Right click on project > Properties > Spring > Beans Support > Click "scan"
     to discover and add xml files to STS
* Preferenes > Maven > Installations > Add your Maven directory
     do NOT use the built in version
