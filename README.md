# bmi-spring-boot
BMI calculator with Spring Boot. Provides a RESTful service for BMI determination, auto date capture, and storage in PostgreSQL. Features advanced reporting tools.
**Body Mass Index (BMI) Application**
**What the project does:**
This is a Spring RESTful web service application using Spring Boot designed to calculate the Body Mass Index (BMI) based on user input. The application helps users input data like name, surname, date of birth, gender, weight, and height to calculate and categorize their BMI value.

**Why the project is useful:**
With the rise in health awareness, understanding one's BMI is essential. This application not only calculates BMI but also classifies the results and stores the data for future reference. Additionally, its modular database design ensures easy scalability and maintenance.

**Features**
- Personal data entry: User can input their name, surname, date of birth, gender, weight, and height.
- BMI calculation: Application calculates BMI using the formula BMI = Weight(kg) / Height(m) * Height(m).
- BMI categorization: Based on the calculated BMI, the application categorizes the result into groups like "Normal", "Overweight", "Obese", etc.
- Database storage: All information used in the BMI calculation, including the user's personal data and BMI result, is stored in a PostgreSQL database.
- Reporting: A separate reporting page that can display filtered information based on date and/or person's name.

**Database Design**
The database is designed with three main entities:
1. **Users Entity:** Contains personal information of the users.
   - Attributes: User_ID (PK), First_Name, Last_Name, Birth_Date, Gender
   - Relationship: One-to-Many with BMI_Entry_Result
2. **BMI_Entry_Result Entity:** Represents individual BMI records for each user.
   - Attributes: ID (PK), User_ID (FK), Classification_ID (FK), Weight, Height, Create_Date, Index_Result
   - Relationships:
     - Many-to-One with Users
     - Many-to-One with BMI_Classification
3. **BMI_Classification Entity:** Represents different BMI classification ranges.
   - Attributes: ID (PK), Classification_Name, Lower_Bound_Index_Range, Upper_Bound_Index_Range
   - Relationship: One-to-Many with BMI_Entry_Result

**Implementation Steps**
1. **Database Setup:** Create tables in PostgreSQL based on the provided design.
2. **Spring Boot Backend:**
   - Domain model classes with JPA annotations.
   - Spring Data JPA repositories for CRUD operations.
   - RESTful web services for application operations.
   - PostgreSQL stored procedure, trigger, and view implementations.
3. **Frontend:**
   - Thymeleaf templates for UI.
4. **Testing:** Ensure all components are working as expected.

**Additional Information**
For those interested in the specifics of the triggers, views, and stored procedures, these can be found in the SQL portion of the repository. 

**How users can get started with the project**
_Prerequisites:_
- Java JDK
- Maven
- PostgreSQL

**Setup:**
1. Clone the repository: `git clone [repository-link]`
2. Navigate to the project directory: `cd [project-directory]`
3. Update the application.properties file with your PostgreSQL credentials.
4. Build the project: `mvn clean install`
5. Run the application: `java -jar target/[jar-name].jar`

**Help & Contribution**
For any issues, questions, or contributions, please open an issue in the repository or contact the maintainers directly. Any feedback or contribution is appreciated.
