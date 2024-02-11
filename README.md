# fourchad-backend

### MySQL 8
Run this docker script to create a mysql database locally required to run the application.
```
docker run -p 3308:3306 --name fourchad-mysql -e MYSQL_ROOT_PASSWORD=localpass -e MYSQL_DATABASE=fourchad -e MYSQL_USER=localuser -e MYSQL_PASSWORD=localpass -d mysql:8
```
