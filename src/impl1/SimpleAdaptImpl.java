package impl1;

import impl.SimpleController;
import interfaces.AdaptInterface;
import interfaces.ControllerInterface;

/**
 * Created by zcl on 2019/4/29.
 */
public class SimpleAdaptImpl implements AdaptInterface {

    @Override
    public boolean support(ControllerInterface controllerInterface) {
        return controllerInterface instanceof SimpleController;
    }

    @Override
    public void handler(ControllerInterface controllerInterface) {
        controllerInterface.dosomething();
    }
}
