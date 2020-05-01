# EnrollmentManagement
> Student Database Application:
## Senario: You are an database administrator. You need to create an application to manage students enrollments and balance.

## Your application should do the following:

  - Ask the user how many new students will be added to the database  
  - The user should be prompted to enter the name and year for each student  
  - The student should have a 5-digit unique ID, with the first number being their grade level  
  - A student can enroll in the following courses: History, Mathematics, English, Chemistry, Computer Science. 
  - Each course costs $600 to enroll  
  - The student should be able to view their balance and pay the tuition  
  - To see the status of the student, we should see their name, ID, courses enrolled, and balance
   
### Plan:
  1. A loop for data entry 
       * loop outside: each cycle creates a student object (main)
       * loop inside: input the courses to enroll (student class)
       
  2. Store the courses in a file, read in courses from the file (constructor) 
  
  3. Methods:
  
      + generate student ID:
        * 5-digit
        * first digit = grade (1- freshman; 2- sophomore; 3 -junior; 4 - graduate )
      + enrollment:
         * enter courses; 
         * calculate tuition
      + payTuition:
         calculate balance
      + show details: 
        * student - name;
        * ID; 
        * grade; 
        * courses enrolled;
        * tuition; balance;
      
