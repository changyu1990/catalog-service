## run
`
docker run -d --name polar-postgres -e POSTGRES_USER=user -e POSTGRES_PASSWORD=password -e POSTGRES_DB=polardb_catalog -p 5432:5432 postgres:14
`
## stop
`
docker stop polar-postgres
`
## start
`
docker start polar-postgres
`

## rm
`
docker rm -f polar-postgres
`