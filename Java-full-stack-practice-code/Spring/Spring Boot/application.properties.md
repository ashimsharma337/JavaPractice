In application file we can write all the code to connect our application to the data base

server.port=8080

#db configuration
spring.datasource.url=jdbc:mysql://localhost:3306/DATABASE_NAME
spring.datasource.username=USERNAME
spring.datasource.password=PASSWORD
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

#create , update , create-drop, validate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true