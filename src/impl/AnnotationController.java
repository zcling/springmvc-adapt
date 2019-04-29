package impl;

import interfaces.ControllerInterface;

/**
 * Created by zcl on 2019/4/29.
 */
public class AnnotationController implements ControllerInterface {
    @Override
    public void dosomething() {
        System.out.println("this is AnnotationController");
    }
}
