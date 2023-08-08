# jsf-spring-db2-websphere
JSF 2.3  + spring data jpa + hibernate + db2 + websphere

## Deployment Steps

- Install DB2 in windows
  - Go through this video - [IBM DB2 installation](https://www.youtube.com/watch?v=4hMGzhIQS7k) | [Download DB2 setup file](https://epwt-www.mybluemix.net/software/support/trial/cst/programwebsite.wss?siteId=1120&tabId=2932&p=null&h=null)
- Database credentials (please use the below details)
    ```bash
    - Username: db2admin
    - Password: admin
    - Database: jsf_db 
   ```
- DB2 maven dependancy
    ```bash
    <repositories>
		<repository>
		<id>com.ibm.db2.jcc</id>
		<url>https://artifacts.alfresco.com/nexus/content/repositories/public/</url>
		</repository>
	</repositories>
    <dependency>
		<groupId>com.ibm.db2</groupId>
		<artifactId>jcc</artifactId>
		<version>11.5.8.0</version>
	</dependency>
    ```

- Pull the latest code of this repository
  ```bash
  git remote add origin https://github.com/bharat-sculptsoft/jsf-spring-db2-websphere.git
  git pull origin main
  ```
- Generate maven build
  - Note
    ```bash
    Eclipse should be run as an administrator.
    JDK is required to generate a maven build. 
    ```
  - Update the maven dependency
    ![App Screenshot](https://imgtr.ee/images/2023/08/07/36b9a0ac11c007f13559a895e5267be0.png)
  - Generate maven build
    ![App Screenshot](https://imgtr.ee/images/2023/08/07/e5d83de07723b8db5214a25c13d480a2.png)

- Upload build on Websphere
  - Go through this video - [Upload build into websphere](https://drive.google.com/file/d/1Dzqi__e7Onjyvg3zLt6PORbtImNXmuSh/view?usp=drive_link)
