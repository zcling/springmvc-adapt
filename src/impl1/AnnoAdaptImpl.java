package impl1;

import impl.AnnotationController;
import interfaces.AdaptInterface;
import interfaces.ControllerInterface;

/**
 * Created by zcl on 2019/4/29.
 */
public class AnnoAdaptImpl implements AdaptInterface {
    @Override
    public boolean support(ControllerInterface controllerInterface) {
        return controllerInterface instanceof AnnotationController;
    }

    @Override
    public void handler(ControllerInterface controllerInterface) {
        controllerInterface.dosomething();
    }
}
