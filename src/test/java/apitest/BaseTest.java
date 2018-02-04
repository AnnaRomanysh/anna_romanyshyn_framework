package apitest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import ui.driver.Driver;
import utils.TestLogger;

import java.lang.reflect.Method;

@Listeners(utils.TestListener.class)
public class BaseTest {
    public TestLogger log;
    private Driver driver =  new Driver();


    @BeforeMethod
    public void beforeMethod(Method method) {
        log = TestLogger.getLogger(method.getName(), method.getDeclaringClass().getSimpleName(), method.getDeclaringClass().getPackage().getName());

    }
    public void info(String message){
        log = TestLogger.getLogger();
        log.info(message);
    }

    @AfterClass
    public void afterMethod(){
        driver.quit();
    }

}
