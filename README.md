<h1 align="center">
  <br>
  FishLogApp
  <br>
  <br>
  <a><img src="https://github.com/user-attachments/assets/d33d76ee-09bd-4134-8275-fdf2dedbf20b" width="300" height="300"></a>
</h1>

<h3 align="center">
  A fish logging web app that tracks the fish you caught. 
</h3>

<h1 align="center">
  <br>
    Dashboard
  <br>
  <br>
  <a><img src="https://github.com/user-attachments/assets/9f532f51-9518-4f62-aafa-84d6ca05e8e9" width="600" height="400"></a>
  <br>
</h1>

<h1>
  Overview
</h1>
<p> The project uses MySQL to collect fish metrics to add to a database. This database lets you keep track of the fish you caught. It is a Rest API that let's the user GET and POST fish data. Inspiration came from my interest in backend with java and bass fishing!🐟</p>


<h1>
  How To Use
</h1>

**Step 1:**
<br>

```bash
 # Clone Repository
 $ git clone https://github.com/JBaeza27/FishLogApp.git
```

**Step 2:**
<br>
Use [XAMPP](https://www.apachefriends.org/download.html) Control Panel. Once downloaded open up the control panel. 
<br>

<h1 align="center">It should look like this
</h1>
<a><img src="https://github.com/user-attachments/assets/9d32fc7e-87c4-4165-90cf-811881b59d8d"  width="400" height="200"></a>
<br>
<br>
Press Start (under Actions) on both Apache and MySQL (under Module). Press Admin for MySQL once it starts up.
<br>
Once directed to the phpMyAdmin, press New to the left side to add a database (remember the name).
<br>
<br>
<a><img src="https://github.com/user-attachments/assets/e30eac21-4922-4d69-bf2b-cec03b508695"  width="88" height="19"></a>
<br>
<br>

**Step 3:**

```bash
 # Change application.properties file
 # Located in src/main/resources/application.properties

  spring.datasource.url=jdbc:mysql://localhost:(MySQL port)/(Database name)
  spring.datasource.username= (Your MySQL username)
  spring.datasource.password= (Your MySQL password)

  # Refer to Step 2 to find the 'port'. It will be under Port(s) for MySQL
```

**Step 4:**

```bash
$ cd FishLogApp
$ mvn clean install
$ mvn spring-boot:run
```
**Step 5:**
<br>
Once step 4 is completed, the Springboot application will be redirected to a Tomcat Server
```bash
# Open on browser
http://localhost:8080
```
**(Optional) Step 6:**
<br>
Install [Postman](https://www.postman.com/downloads/) for testing and use @RequestMapping("/api/fish") with @GetMapping("/getAll") to see all fish caught. Enjoy the Rest API!
<br>
<br>
<a><img src="https://github.com/user-attachments/assets/d1eb68c3-f137-4598-9208-d9b53801e7e9"></a>



