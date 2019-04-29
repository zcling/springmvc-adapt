package impl;

import interfaces.ControllerInterface;

/**
 * Created by zcl on 2019/4/29.
 */
public class SimpleController implements ControllerInterface {
    @Override
    public void dosomething() {
        System.out.println("this is SimpleController");
    }
}
