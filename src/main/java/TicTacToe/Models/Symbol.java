package TicTacToe.Models;

public class Symbol {
    private  char symbol;
    private String color;
    public Symbol(char symbol, String color) {
        this.symbol = symbol;
        this.color = color;
    }
    public char getSymbol() {
        return symbol;
    }
    public String getColor(){
        return color;
    }
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
    public void setColor(String color) {this.color = color;}
}
