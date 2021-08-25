
start-environment:
	docker-compose -p service_env -f ./environment/docker-compose.yaml up

down-environment:
	docker-compose -p service_env -f ./environment/docker-compose.yaml down

start-project:
	mvn spring-boot:run
