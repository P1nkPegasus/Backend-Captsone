# Backend-Captsone

deployed link: 

[//]: # (https://springboot-postgresql-charity.herokuapp.com/)
https://springboot-postgresql-charity.herokuapp.com/api/charities

## Purpose
In the United States alone there were approximately 37.2 million people in poverty and approximately 580,466 people who are displaced from their homes. These populations need to have clothing that allows them to go through their day-to-day lives. For example, someone may need a new suit for an interview to get them back on their feet or a child may need a new uniform for the upcoming school year.
<br> 
<br>This application allows sponsors to see which charity needs have yet to be met. The models are the charities, the household receiving the donations, the individuals in each household, and their clothing needs. The expectation of this application is to make sure that households’ needs are adequately met.

## Thought Process

The first step I took in creating this application was searching through a variety of my passions for inspiration. From there, I searched for inefficiencies in different industries and figure out which problem I will be able to solve given a one-week time frame. My focus was specifically on how the back end would work. For example, what models I would have and what attributes would go with them so I used a white board to brainstorm and then created an entity relationship diagram (ERD). 

## Entity Relationship Diagram (ERD)
![Charity App ERD](https://user-images.githubusercontent.com/77082461/156379757-a46abc53-e461-4e4e-99e0-45e36da0e480.png)

## User Stories 

| 1   | As a User I should be able to see all charities                                       |
|-----|---------------------------------------------------------------------------------------|
| 2   | As a User I should be able to create a new charity                                    |
| 3   | As a User I should be able to see all households                                      |
| 4   | As a User I should be able to see all individuals                                     |
| 5   | As a User I should be able to see all clothing items                                  |
| 6   | As a User I should be able to see all households in a given charity                   |
| 7   | As a User I should be able to see all individuals in a household                      |
| 8   | As a User I should be able to see all clothing items needed for a specific individual |

## Endpoints
| REQUEST TYPE | CHARITY URL                  |
|--------------|------------------------------|
| GET          | _/api/charities_             |
| GET          | _/api/charities/charitiesId_ |
| POST         | _/api/charities_             |
| PUT          | _/api/charities/charitiesId_ |
| DELETE       | _/api/charities/charitiesId_ |

| REQUEST TYPE | HOUSEHOLD URL                                       |
|--------------|-----------------------------------------------------|
| GET          | _/api/charities/charitiesId/households_             |
| GET          | _/api/charities/charitiesId/households/householdId_ |
| POST         | _/api/charities/charitiesId/households_             |
| PUT          | _/api/charities/charitiesId/households/householdId_ |
| DELETE       | _/api/charities/charitiesId/households/householdId_ |


## Dependencies 

  `  <dependencies>
  <dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter</artifactId>
  </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
    </dependencies>`