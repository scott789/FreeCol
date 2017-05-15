package net.sf.freecol.common.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sf.freecol.common.model.Player.PlayerType;
import net.sf.freecol.common.model.Player.UnitIterator;

public class PlayerData {
	/**
	 * The name of this player.  This defaults to the user name in
	 * case of a human player and the rulerName of the NationType in
	 * case of an AI player.
	 */
	public String name;
	/** The name of this player as an independent nation. */
	public String independentNationName;
	/** The type of player. */
	public PlayerType playerType;
	/** The player nation type. */
	public NationType nationType;
	/** The nation identifier of this player, e.g. "model.nation.dutch". */
	public String nationId;
	/** The name this player uses for the New World. */
	public String newLandName;
	/** Is this player an admin? */
	public boolean admin;
	/** Is this player an AI? */
	public boolean ai;
	/** Is this player ready to start? */
	public boolean ready;
	/** Is this player dead? */
	public boolean dead;
	/** True if player has been attacked by privateers. */
	public boolean attackedByPrivateers;
	/**
	 * Whether the player is bankrupt, i.e. unable to pay for the
	 * maintenance of all buildings.
	 */
	public boolean bankrupt;
	/** The current score of this player. */
	public int score;
	/** The amount of gold this player owns. */
	public int gold;
	/**
	 * The number of immigration points.  Immigration points are an
	 * abstract game concept.  They are generated by but are not
	 * identical to crosses.
	 */
	public int immigration;
	/**
	 * The amount of immigration needed until the next unit decides
	 * to migrate.
	 */
	public int immigrationRequired;
	/**
	 * The number of liberty points.  Liberty points are an
	 * abstract game concept.  They are generated by but are not
	 * identical to bells.
	 */
	public int liberty;
	/** SoL from last turn. */
	public int oldSoL;
	/** The number of liberty bells produced towards the intervention force. */
	public int interventionBells;
	/** The current tax rate for this player. */
	public int tax;
	/** The player starting location on the map. */
	public Location entryLocation;
	/** The market for Europe. */
	public Market market;
	/** The European port/location for this player. */
	public Europe europe;
	/** The monarch for this player. */
	public Monarch monarch;
	/** The founding fathers in this Player's congress. */
	public Set<FoundingFather> foundingFathers;
	/** Current founding father being recruited. */
	public FoundingFather currentFather;
	/** The offered founding fathers. */
	public List<FoundingFather> offeredFathers;
	/**
	 * The tension levels, 0-1000, with 1000 being maximum hostility.
	 *
	 * Only used by AI, but resist the temptation to move it to AIPlayer, the
	 * complexity is not worth it.
	 */
	public Map<Player, Tension> tension;
	/** A list of players who can not establish missions to this player. */
	public Set<Player> bannedMissions;
	/**
	 * Stores the stance towards the other players. One of: WAR, CEASE_FIRE,
	 * PEACE and ALLIANCE.
	 */
	public Map<String, Stance> stance;
	/** The trade routes defined by this player. */
	public List<TradeRoute> tradeRoutes;
	/** The current model messages for this player. */
	public List<ModelMessage> modelMessages;
	/** The history events occuring with this player. */
	public List<HistoryEvent> history;
	/** The last-sale data. */
	public HashMap<String, LastSale> lastSales;
	/** The units this player owns. */
	public List<Unit> units;
	/** The settlements this player owns. */
	public List<Settlement> settlements;
	/** The tiles the player can see. */
	public boolean[][] canSeeTiles;
	/** Are the canSeeTiles valid or do they need to be recalculated? */
	public boolean canSeeValid;
	/** Do not access canSeeTiles without taking canSeeLock. */
	public Object canSeeLock;
	/** A container for the abilities and modifiers of this type. */
	public FeatureContainer featureContainer;
	/** The maximum food consumption of unit types available to this player. */
	public int maximumFoodConsumption;
	/** An iterator for the player units that are still active this turn. */
	public UnitIterator nextActiveUnitIterator;
	/** An iterator for the player units that have a destination to go to. */
	public UnitIterator nextGoingToUnitIterator;
	/** An iterator for the player units that have a trade route to follow. */
	public UnitIterator nextTradeRouteUnitIterator;
	/**
	 * The HighSeas is a Location that enables Units to travel between
	 * the New World and one or several European Ports.
	 */
	public HighSeas highSeas;
	/** A cached map of the current nation summary for all live nations. */
	public Map<Player, NationSummary> nationCache;

	public PlayerData(String newLandName, boolean dead, boolean attackedByPrivateers, int oldSoL, int tax,
			Set<FoundingFather> foundingFathers, List<FoundingFather> offeredFathers, Map<Player, Tension> tension,
			Set<Player> bannedMissions, Map<String, Stance> stance, List<TradeRoute> tradeRoutes,
			List<ModelMessage> modelMessages, List<HistoryEvent> history, HashMap<String, LastSale> lastSales,
			List<Unit> units, List<Settlement> settlements, boolean[][] canSeeTiles, boolean canSeeValid,
			Object canSeeLock, FeatureContainer featureContainer, int maximumFoodConsumption,
			UnitIterator nextActiveUnitIterator, UnitIterator nextGoingToUnitIterator,
			UnitIterator nextTradeRouteUnitIterator, HighSeas highSeas, Map<Player, NationSummary> nationCache) {
		this.newLandName = newLandName;
		this.dead = dead;
		this.attackedByPrivateers = attackedByPrivateers;
		this.oldSoL = oldSoL;
		this.tax = tax;
		this.foundingFathers = foundingFathers;
		this.offeredFathers = offeredFathers;
		this.tension = tension;
		this.bannedMissions = bannedMissions;
		this.stance = stance;
		this.tradeRoutes = tradeRoutes;
		this.modelMessages = modelMessages;
		this.history = history;
		this.lastSales = lastSales;
		this.units = units;
		this.settlements = settlements;
		this.canSeeTiles = canSeeTiles;
		this.canSeeValid = canSeeValid;
		this.canSeeLock = canSeeLock;
		this.featureContainer = featureContainer;
		this.maximumFoodConsumption = maximumFoodConsumption;
		this.nextActiveUnitIterator = nextActiveUnitIterator;
		this.nextGoingToUnitIterator = nextGoingToUnitIterator;
		this.nextTradeRouteUnitIterator = nextTradeRouteUnitIterator;
		this.highSeas = highSeas;
		this.nationCache = nationCache;
	}
}