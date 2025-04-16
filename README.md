Eid project of me(Amir Mahdi Imani):
Steps i followed to complete this project:
Admin Class:
Overview:
The Admin class represents an administrative role within a system, likely related to job applications or artist management. It contains two simple methods that simulate admin operations.

Methods:
void acceptrequest()
Simulates a job application process.
Prints messages indicating that a request has been sent and accepted.

void checkactivity(String artistname)
Used to check the status of an artist.
Currently prints a generic message that "Everything is ok."
Input:
artistname: the name of the artist whose activity is being checked.



USER Class:
Overview:
The USER class is an abstract base class defining the main attributes and behaviors of a user in a music-related platform. It is intended to be extended by other user types (e.g., Artist, Listener).

Fields:
String username: users name.
String password: users password.

Abstract Methods:
These must be implemented by any subclass:
void like(): Like a song or content.

void comment(): Comment on a track or post.

void play(): Play a song.

void showAvailableMusic(): Show list of accessible music.

void Follow(String Artistname): Follow a specific artist.



Manage Class:
The manage class handles user-related operations in the system, including:

User registration (as Artist or Person)

Login for existing users

User authentication (choosing between login or sign-up)

A basic captcha to confirm that the user is human

It uses a static list to keep track of all registered users and assigns the currently logged-in user to Main.user.

Fields:
private static ArrayList<USER> users
Holds all registered users.

Methods:
public static boolean signUp(String username, String password)
Handles user registration. Asks the user to choose between registering as an Artist or Person.

Validation includes:

Username must not be empty

Password must be at least 8 characters

Username must be unique

On success, the user is added to the system and a success message is printed.

public static boolean login(String username, String password)
Searches the user list for a match based on username and password.
Returns true if found, otherwise shows an error message and returns false.

public static USER authenticate()
A wrapper method that asks the user whether they want to log in or sign up.
Takes input for username and password, and then calls the appropriate method.

public static void checkpolicy()
A basic CAPTCHA-style method to confirm that the user is human.
Prompts the user to type a hardcoded verification code (AQE123R).
If incorrect, it repeats until the user gets it right


Person Class:
Overview:
The Person class represents a regular user in the system who is not an artist. This class extends the abstract USER class and implements all abstract methods like liking a song, commenting, following an artist, and more.

Fields:
private Artist artist;
Used to retrieve the list of available music via artist.getMusicList(). However, it seems like it's never initialized in this class it may need to be passed or set externally to work properly.

Constructor:
public Person(String username, String password)
Initializes the Person object using the constructor from the USER class.

Implemented Methods:
public void rewritelyrics(String a)
Asks which music to modify.

Prompts the user to rewrite lyrics.

Uses replaceAll (though it currently replaces the whole original string with itself this logic might need fixing).

public void like()
Asks the user which music to like.

If the user types 'l', it prints a confirmation message.

public void comment()
Takes a comment input and confirms that the user commented on the song.

(Optional improvement: actually store/display the comment.)

public void showAvailableMusic()
Fetches and displays a list of music from the artist object.

Note: Since artist is private and not set, this will throw a NullPointerException unless artist is assigned before calling this method.

public void play()
Prompts the user to enter the music they want to play.

If the user types "play", confirms the music is being played.

public void Follow(String Artistname)
Simply prints a confirmation message that the user followed the specified artist.



Artist Class:
Overview:
The Artist class represents a user who is an artist in your music platform. It extends the abstract USER class and provides additional features such as:

Adding music

Creating albums

Uploading lyrics

Artists can also like, comment, play music, and be followed, just like regular users.

Fields:
private String musicname: (Unused in logic so far could be removed or implemented.)

private static ArrayList<String> musiclist: A shared list of all songs added by artists.

private static ArrayList<String> albumlist: (Declared but not used consider implementing it or removing.)

Constructor:
public Artist(String username, String password)
Initializes the artist with a username and password using the superclass USER.

Implemented Methods (from USER):
public void like()
Reads user input.

If the user types 'l', it confirms that the user liked the song.

public void comment()
Waits for the user to enter 'c', then accepts a comment and prints confirmation.

(Suggestion: store the comment instead of just printing it.)

public void play()
Prints a confirmation message that the song is played.

public void showAvailableMusic()
Displays all songs currently in the static musiclist.

public void Follow(String Artistname)
Prints a confirmation that the user followed the specified artist.

Artist-Specific Methods:
void musiclyric(String musicName)
Confirms that lyrics for the given song were uploaded.

void makeAlbum(String musicname)
Prompts the artist to enter an album name.

Displays the name of the album and the associated song.

(Suggestion: Store album info in albumlist.)

void addmusic(String musicname)
Adds a music track to the shared music list.

Prints a confirmation message.

Static Method:
public static ArrayList<String> getMusicList()
Returns the current list of music available (shared among all artists).


Main Class:
Overview:
The Main class is the entry point of the Music Management System. It provides a command-line interface that allows users to:

Sign up or log in as either an Artist or a Person (regular user)

Perform music-related actions (like, comment, play, etc.)

Log in as an Admin to monitor artist activity

The system loops until the user chooses to exit.

Fields:
public static USER user: Holds the currently logged-in user.

public static Admin admin: Admin object for performing admin tasks.

private static final String Adminpassword: Hardcoded admin password.

private static Scanner scanner: Shared scanner for user input.

public static String lyric: Temporarily stores user-submitted lyrics.

Main Flow (Inside main()):
Displays a main menu with three options:

Login/Sign Up

Admin Login

Exit

If the user chooses login/sign up:

Calls manage.authenticate() to handle account creation or login.

Calls manage.checkpolicy() to simulate CAPTCHA.

Asks whether the user is a User or Artist, then redirects to the appropriate menu.

If the user chooses Admin login:

Prompts for the admin password.

Displays the admin menu (e.g., checking artist activity).

userMenu() (For Person users):
Allows the user to:

Like a song

Comment on a song

Play a song

View available music

Follow an artist

Rewrite lyrics (sends a request to admin)

Logout

artistMenu() (For Artist users):
Allows the artist to:

Add music (and upload lyrics)

Create albums

View available music

Follow another artist

Logout