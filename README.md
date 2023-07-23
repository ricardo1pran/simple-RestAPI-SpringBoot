# Simple RestAPI Spring Boot 3
Simple RestAPI example using Spring Boot 3. Work in Progress.

## Contents
I created with simple non-database user class. The first 5 user was generated in the UserService using userList.
``` public UserService(){
        userList = new ArrayList<>();
        User user1 = new User(1, "Wakamama", 35,"remember@norussian.com");
        User user2 = new User(2, "Wagayama", 23,"forgot@norussian.com");
        User user3 = new User(3, "Sugoijan", 33,"isit@norussian.com");
        User user4 = new User(4, "Sukijan", 25,"wdym@norussian.com");
        User user5 = new User(5, "Sukirman", 30,"omg@norussian.com");

        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5));
    }
```
### Details
The User class contains ID, Name, Age and Email.
The User service itself for now could get the detail of the user, returning Optional<User>.
Work in progress includes:
- Add new user, with continuous incremental ID
- Delete users
- Update user details

## Usage
You can clone this project as a starting project or helper if you want to.
I made this as simple as possible so you can modify it to whatever that suits your project.

NOTE: This readme is also work in progress. I'll add details later.
