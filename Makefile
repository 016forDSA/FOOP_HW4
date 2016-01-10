all: POOCasino.class PlayerB02902016.class
POOCasino.class: ./src/POOCasino.java
	@echo Compile...
	@javac -d ./lib -cp ./lib -Xlint ./src/POOCasino.java ./src/CasinoChain.java
PlayerB02902016.class: ./src/PlayerB02902016.java
	@echo Player Generating...
	@javac -d ./lib -cp ./lib -Xlint ./src/PlayerB02902016.java
run: 
	@echo Run...
	java -cp ./lib POOCasino 1 10 PlayerB02902016 PlayerB02902016 PlayerB02902016 PlayerB02902016