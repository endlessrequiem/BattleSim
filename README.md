# Celero Commerce Android Code Challenge

In this README, I will go over what I was able to accomplish for this coding challenge and what issues I ran into. 

[Link to Video Demo](https://res.cloudinary.com/deflyzun6/video/upload/v1601263240/celeroapp/celeroproject_ohoc2z.mp4)

# What I accomplished

I prioritized building a functioning app, so I started with putting together the core functionality of the app;
mainly putting together the features that would be absolutely necessary if I had to use the app the next day.

Two important pieces I was able to implement were Retrofit and SQLite. I prioritized these as they seemed to be the most essential pieces of the
core functionality of the app, and I had never used them before, so I wanted to learn them and implement them before I did anything else. 

*  I had never used Retrofit prior so i spend a few hours getting through the learning curve, I was able to 
successfully retrieve JSON data from the API and use it to populate the ListView in the app
*  Once I got Retrofit working properly, I moved on to getting the SQLite database up and running
*  The SQLite database took the most time since I hadn't had much experience with SQL so I had to do a lot of research
*  By Sunday, I was able to write data to the local SQLite database but struggled with data retrieval
*  My goal with the SQLite database was to intercept the incoming JSON data and parse it into the SQLite database
and then have the ListView pull from the database.


![alt text](https://res.cloudinary.com/deflyzun6/image/upload/v1601260118/celeroapp/Screenshot_1601260092_jeimja.png =100x20 "Screenshot 1") ![alt text](https://res.cloudinary.com/deflyzun6/image/upload/v1601260118/celeroapp/Screenshot_1601260098_y9y1wo.png =100x20 "Screenshot 2")


I also managed to add a Google maps button that took the provided GPS coordinates and put them into Google Maps (As seen in the Demo). I also made
it so the text can be highlighted so numbers can be quickly called, or addresses quickly copied in case the GPS coordinates aren't working properly.

Here are the screenshots.

![alt text](https://res.cloudinary.com/deflyzun6/image/upload/v1601260417/celeroapp/Screenshot_1601260358_j8xp6x.png =100x20 "Screenshot 3") ![alt text](https://res.cloudinary.com/deflyzun6/image/upload/v1601260419/celeroapp/Screenshot_1601260371_jshbdm.png =100x20 "Screenshot 4")



