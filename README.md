Eid project of me(Amir Mahdi Imani):
Steps i followed to complete this project:
1.Admin Class
📁 Class Overview
The Admin class provides two main methods:

1. checkrequest(String requestnotif)
Purpose:
Displays the content of a request notification and simulates the admin accepting the request.

requestnotif: A string that contains the request message.

2. checkactivity(String Artistname, String addedDateTime)
Purpose:
Checks if an artist has had activity within the last 30 days.

Artistname: The name of the artist.

addedDateTime: A string representing the date and time when the artist was added or last active, in the format "yyyy-MM-dd HH:mm:ss".

Logic:
Compares the given date to the current system date. If more than 30 days have passed, a warning is printed.

2.USER Class
📁 Class Overview
USER Abstract Class
An abstract base class for all types of users (e.g., artists, listeners) in the system. It defines essential behaviors that every user must implement.

Abstract Methods:
like() — For liking a song

comment() — For leaving a comment

play() — For playing a song

showAvailableMusic() — For displaying all available music

Concrete Method:
rewritelyrics() — An optional method that can be overridden in subclasses to allow editing lyricsUSER Abstract Class

