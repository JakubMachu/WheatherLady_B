# WheatherLady_B

Brief description of the system
As part of the project, a system should be created to collect data from one or preferably two/three weather services (or use files) and provide the average (the result should be a given weather value calculated as the arithmetic average of the results returned by each service) values calculated on the basis of the responses returned.

Main system functions
Downloading weather data from relevant web services (or files on your local disc)
Downloaded data should be saved to the database
The application should use the city date and location to retrieve average values
Average results should be saved in the database
Technologies
Console application
JDBC or Hibernate
Domain logic divided into layers, eg DAO, Service
Unit testing tools
Optionally:

Http client, e.g. HttpClient, OkHttp
Application presentation layer based on a pattern, eg MVC/MVP
JSON data serialization/deserialization tool, eg Gson, Jackson
dependency injection framework, such as Guice
JavaFX based frontend
Functionalities
User Interface
Within the console/graphic view, the user should be able to select one of the following options:

adding specific locations to the database
displaying currently added locations
downloading weather values
Adding a location
The user should be able to add a location to the database by entering the following values:

id
longitude and latitude
region
country name
Additionally, as part of the task, the user should ensure appropriate validation:

id - optional: UUID format
longitude and latitude according to geographical values ​​(latitude: -90 -> S, 90 -> N, longitude: -180 -> W, 180 -> E)
city name - cannot be empty
region - optional: may be null
Country name - cannot be empty
If incorrect data are entered, the user should be notified via an appropriate message.

Display of available locations
By selecting the menu option, the user should be able to see all locations entered into the database.

Downloading weather data
Downloading weather data from external services
Under this option, the user should be able to download data from e.g. the following systems:

https://openweathermap.org/api
https://developer.accuweather.com/apis
https://weatherstack.com/documentation
Supported parameters
The user should be able to retrieve the following values:

temperature
pressure
humidity
wind direction and speed
Values ​​taken from external websites should be averaged and saved additionally to the database before being returned to the user.

Available download configurations
The user can indicate the following values ​​via the application:

DATE
The request may indicate the date on which the weather is to be checked. If the user does not enter the date in the agreed format, the weather for tomorrow should be checked.

LOCATION
The request may indicate the location for which the values ​​should be returned. The location should be able to be communicated as city name or a geographic coordinate. Before using it, the location should be saved in the database.

Optional functionalities
Edit location
As part of the new menu option, the user should be able to edit the currently added locations. Validation should also be included in the edit.

Location search
The user should be able to display information about a specific location by searching for it, e.g. by name.

Statistic data
The user should be able to display statistical data on selected weather values ​​from a specific time period, e.g. month, year. Data for this purpose should be downloaded directly from the database.

Data write/read
The user should be able to save the currently collected data to a file in any format, and then restore them by saving directly to the database.

Unit tests
The implemented functionalities should be covered with unit tests in accordance with commonly used methodologies and practices.

NOTE:: Please note that, most probably, you will not be able to write tests for all classes because topics related with mocking has not yet been covered.

Additional requirements
The program should meet the following criteria:

functionality
code quality (transparency, maintainability, structure)
use of the latest technologies (at least the latest stable version of JDK, the latest stable versions of libraries)
user experience
reliability
The task is formulated very generally on purpose. If something is not specified, it can be implemented in a way that is convenient for the student. There are no preferred solutions or technologies other than those listed.
