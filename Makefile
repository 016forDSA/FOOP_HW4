all: POOCasino.class
POOCasino.class: ./src/POOCasino.java
	@echo Compile...
	@javac -d ./lib -cp ./lib ./src/POOCasino.java ./src/CasinoChain.java
run: 
	@echo Run...
	@java -cp ./lib POOCasino 100 10 Player1 Player2 Player3 Player4