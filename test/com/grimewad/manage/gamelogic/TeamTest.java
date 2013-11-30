package com.grimewad.manage.gamelogic;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TeamTest {
	
	private Team team;

	@Before
	public void setUp() throws Exception {
		team = new Team("Test Team");
	}

	@Test
	public void testSquadGeneration() {
		List<Player> players = team.getPlayers();
		assertEquals(23, players.size());
	}
	
	@Test
	public void testMatchOutcomeMethods(){
		team.win(3, 1);
		assertEquals(3, team.calculatePoints());
		assertEquals(2, team.calculateGoalDiff());
		assertEquals(1, team.getGamesPlayed());
		assertEquals(1, team.getGamesWon());
		assertEquals(0, team.getGamesLost());
		team.draw(1, 1);
		assertEquals(4, team.calculatePoints());
		assertEquals(2, team.calculateGoalDiff());
		assertEquals(2, team.getGamesPlayed());
		assertEquals(1, team.getGamesWon());
		assertEquals(1, team.getGamesDrawn());
		assertEquals(0, team.getGamesLost());
		team.lose(1, 4);
		assertEquals(4, team.calculatePoints());
		assertEquals(-1, team.calculateGoalDiff());
		assertEquals(3, team.getGamesPlayed());
		assertEquals(1, team.getGamesWon());
		assertEquals(1, team.getGamesDrawn());
		assertEquals(1, team.getGamesLost());
	}

}
