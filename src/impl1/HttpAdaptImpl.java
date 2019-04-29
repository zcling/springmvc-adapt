package impl1;

import impl.HttpController;
import interfaces.AdaptInterface;
import interfaces.ControllerInterface;

/**
 * Created by zcl on 2019/4/29.
 */
public class HttpAdaptImpl implements AdaptInterface {
    @Override
    public boolean support(ControllerInterface controllerInterface) {
        return controllerInterface instanceof HttpController;
    }

    @Override
    public void handler(ControllerInterface controllerInterface) {
        controllerInterface.dosomething();
    }
}
