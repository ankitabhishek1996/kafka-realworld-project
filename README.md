command used during this project

mvn archetype:generate -DgroupId=com.ankit.springboot -DartifactId=kafka-consumer-wikimedia -DinteractiveMode=false


docker exec -it d23d183aa4d1 kafka-topics.sh --bootstrap-server localhost:9092 --list


docker exec -it d23d183aa4d1 kafka-topics.sh --bootstrap-server localhost:9092 --describe --topic wikimedia_recentchange

docker exec -it d23d183aa4d1 kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic wikimedia_recentchange --from-beginning

