FROM ubuntu:20.10 

RUN apt-get update \
		&& apt-get install -y default-jre \
		&& apt-get install -y default-jdk \
		&& apt-get install -y build-essential

COPY Servidor.java .

RUN javac -encoding UTF-8 Servidor.java
