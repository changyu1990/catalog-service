| Docker Command	                                                                                                                                   |              Description              |
|:--------------------------------------------------------------------------------------------------------------------------------------------------|:-------------------------------------:|
| `docker run -d --name polar-postgres -e POSTGRES_USER=user -e POSTGRES_PASSWORD=password -e POSTGRES_DB=polardb_catalog -p 5432:5432 postgres:14` | Run PostgreSQL as a Docker container. |
| `docker stop polar-postgres`                                                                                                                      |            Stop container.            | 
| `docker start polar-postgres`                                                                                                                     |           Start container.            |
| `docker remove -fv polar-postgres`                                                                                                                |           Remove container.           |
