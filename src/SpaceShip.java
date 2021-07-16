package MissionSpecs;

public interface SpaceShip {
    public abstract boolean launch();
    public abstract boolean land ();
    public abstract boolean canCarry(Item item);
    public abstract void carry(Item item);


}
