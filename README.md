# Backend-Captsone

deployed link: 

[//]: # (https://springboot-postgresql-charity.herokuapp.com/)
https://springboot-postgresql-charity.herokuapp.com/api/charities

## Purpose
In the United States alone there were approximately 37.2 million people in poverty and approximately 580,466 people who are displaced from their homes. These populations need to have clothing that allows them to go through their day-to-day lives. For example, someone may need a new suit for an interview to get them back on their feet or a child may need a new uniform for the upcoming school year.
<br> 
<br>This application allows sponsors to see which charity needs have yet to be met. The models are the charities, the household receiving the donations, the individuals in each household, and their clothing needs. The expectation of this application is to make sure that households’ needs are adequately met.


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
