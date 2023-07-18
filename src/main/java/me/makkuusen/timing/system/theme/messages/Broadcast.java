package me.makkuusen.timing.system.theme.messages;

public enum Broadcast implements Message {
    CLICK_TO_SIGN,
    CLICK_TO_RESERVE,
    CLICK_TO_JOIN_RACE,
    CLICK_TO_SPECTATE_EVENT,
    PLAYER_SIGNED_EVENT,
    PLAYER_RESERVE_EVENT,
    EVENT_PLAYER_PIT,
    EVENT_PLAYER_FINISH,
    EVENT_PLAYER_FINISH_BASIC,
    EVENT_PLAYER_FINISHED_LAP,
    EVENT_PLAYER_FASTEST_LAP,
    EVENT_RESULTS,
    EVENT_RESULTS_QUALIFICATION,
    HEAT_RESET,
    HEAT_RESULT_ROW,
    HEAT_FINISH_TITLE,
    HEAT_FINISH_TITLE_POS,
    HEAT_RESULTS;

    @Override
    public String getKey() {
        return "broadcast." + this.name().toLowerCase();
    }
}