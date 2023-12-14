[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-c66648af7eb3fe8bc4f294546bfd86ef473780cde1dea487d3c4ff354943c9ae.svg)](https://classroom.github.com/online_ide?assignment_repo_id=10171681&assignment_repo_type=AssignmentRepo)
# Welcome to the course CSYE6200 - Object Oriented Design
> Northeastern University, College of Engineering


## Professor: Daniel Peters

### Requirements
1. Eclipse or VS Code or IntelliJ.

Note: If you are using Eclipse, please have git CLI installed on your system or GitHub Desktop to commit the code in this repository

### SetUp Instructions
1. Please clone the repository on your local system
2. For Eclipse Import the project as Existing Maven Project, For IntelliJ you can directlty open it using 'Get from VCS'.
4. All code should be pushed to the main branch
3. Ensure the GitHub actions are successful post push

Submissions will have deadlines, failed GitHub Actions would result in point deductions.

### References
1. Cloning a Repository: <https://docs.github.com/en/repositories/creating-and-managing-repositories/cloning-a-repository>
2. Any GitHub Setup: Please refer to the Git & GitHub Fundamentals Repository shared to you by your respective TA and refer the README.md section

Please reach out to your respective TA if you need any help in regards with submission/ GitHub

Author:
- Aditya Mulik (mulik.a@northeastern.edu)
- Sai Akhil Vemula (vemula.v@northeastern.edu)

### specifications of Assignment: 
100 TOTAL POINTS Adapter for existing Stock Program

NOTE: 20 POINT DEDUCTION if submitted to Canvas late or incorrect. 

30 POINTS 1. Create a Client API of your own design.

30 POINTS 2. Create a Legacy API of your own design.

NOTE: BE SURE THAT THE TWO APIs are DIFFERENT.

40 POINTS 3. Create an Adapter which implements the Adapter design pattern:

Adapter will have a static demo method to demonstrate the use of the Adapter design pattern.

REMEMBER:

The Adapter:

A. must derive from the Client API (Class composition via inheritance IS-A Client API derived class)

B. must USE the LEGACY API (to use the LEGACY object via object composition HAS-A LEGACY object)
