package interfaces;

/**
 * Created by zcl on 2019/4/29.
 */
public interface AdaptInterface {
    public abstract boolean support(ControllerInterface controllerInterface);

    public abstract void handler(ControllerInterface controllerInterface);
}
