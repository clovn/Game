package ru.kpfu.itis.group302.players;

public abstract class Bot extends AbstractPlayer {

	public Bot(int hp){
		super("Bot", hp);
	}

	public abstract boolean attack(AbstractPlayer enemy);
}