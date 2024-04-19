package TicTacToe.Models;

import TicTacToe.stratgies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    Board board;
    List<Player> players;
    List<Move> moves;
    Player winner;
    int nextPlayerIndex;
    GameState gameState;
    List<WinningStrategy>winningStrategies;
    public static GameBuilder getGameBuilder(){
        return new GameBuilder();
    }
    private Game(int dimension,List<Player> players,List<WinningStrategy>winningStrategies) {
        this.board = new Board(dimension);
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.moves = new ArrayList<>();
        this.nextPlayerIndex = 0;
        this.gameState = GameState.IN_PROGRESS;
    }
    public static class GameBuilder{
        private int dimension;
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;

        public int getDimension() {
            return dimension;
        }

        public GameBuilder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public List<Player> getPlayers() {
            return players;
        }

        public GameBuilder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public List<WinningStrategy> getWinningStrategies() {
            return winningStrategies;
        }

        public GameBuilder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }
        private void validate(){
            // Bot count
            int botCounter = 0;
            for(Player player : players){
                if(player.getPlayerType().equals(PlayerType.BOT_PLAYER)){
                    botCounter++;
                }
            }
            if(botCounter >1){
                throw new RuntimeException("Too many bots");
            }
            // no of players
            if(players.size() !=this.dimension-1){
                throw new RuntimeException("No of players are invalid");
            }
            // symbol vaidation


        }
        public Game build(){
            validate();
            return new Game(this.dimension, this.players, this.winningStrategies);
        }
        public GameBuilder addPlayer(Player player){
            this.players.add(player);
            return this;
        }
        public GameBuilder addWinningStrategy(WinningStrategy winningStrategy){
            this.winningStrategies.add(winningStrategy);
            return this;
        }
    }
    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }
    // in case you wanna add new player/strategies in between the game
    public void addPlayer(Player player){
        this.players.add(player);
    }
    public void addWinningStrategy(WinningStrategy winningStrategy){
        this.winningStrategies.add(winningStrategy);
    }
}
