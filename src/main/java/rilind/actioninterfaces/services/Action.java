package rilind.actioninterfaces.services;

public interface Action<Req> {
    void performAction(Req req);
}